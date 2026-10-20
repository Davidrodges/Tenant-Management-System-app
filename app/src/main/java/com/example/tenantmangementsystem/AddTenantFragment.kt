package com.example.tenantmangementsystem

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.tenantmangementsystem.databinding.FragmentAddTenantBinding

class AddTenantFragment : Fragment() {

    private var _binding: FragmentAddTenantBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAddTenantBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.saveTenantButton.setOnClickListener {
            val name = binding.tenantNameEditText.text.toString().trim()
            val phone = binding.tenantPhoneEditText.text.toString().trim()
            val rent = binding.tenantRentEditText.text.toString().trim()

            var isValid = true
            if (name.isEmpty()) {
                binding.tenantNameEditText.error = "Required"
                isValid = false
            }
            if (phone.isEmpty()) {
                binding.tenantPhoneEditText.error = "Required"
                isValid = false
            }
            if (rent.isEmpty()) {
                binding.tenantRentEditText.error = "Required"
                isValid = false
            }

            if (!isValid) return@setOnClickListener

            val tenant = Tenant(name, phone, rent)
            Toast.makeText(requireContext(), "Tenant saved", Toast.LENGTH_SHORT).show()

            val bundle = Bundle().apply {
                putSerializable("tenant", tenant)
            }
            findNavController().navigate(R.id.action_addTenantFragment_to_viewTenantsFragment, bundle)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
