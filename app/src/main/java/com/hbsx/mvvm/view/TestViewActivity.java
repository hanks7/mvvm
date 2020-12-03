package com.hbsx.mvvm.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.hbsx.mvvm.R;
import com.hbsx.mvvm.vm.TestViewModel;
import com.hbsx.mvvm.databinding.ActivityMainBinding;


public class TestViewActivity extends AppCompatActivity {

    private ActivityMainBinding binding;//这里其实就是把R.layout.activity_main转成ActivityMainBinding 其实就是驼峰命名法
    private TestViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        viewModel = new TestViewModel(binding);
        binding.setViewModel(viewModel);
        binding.setActivity(this);
    }
}
