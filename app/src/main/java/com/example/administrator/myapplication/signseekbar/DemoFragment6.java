/*
 * Copyright (C) 2018 zhouyou(478319399@qq.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.administrator.myapplication.signseekbar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.myapplication.R;
import com.zhouyou.view.seekbar.SignSeekBar;

import java.text.DecimalFormat;
import java.util.Random;

public class DemoFragment6 extends Fragment {

    public static DemoFragment6 newInstance() {
        return new DemoFragment6();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_demo_6, container, false);
        test1(view);
//        test2(view);
//        test3(view);
        view.findViewById(R.id.updateBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value = new Random().nextInt(100);
                signSeekBar1.getConfigBuilder()
                        .min(value)
                        .max(value + 50)
                        .progress(new Random().nextInt(50) + value).build();
            }
        });
        return view;
    }


    SignSeekBar signSeekBar1;

    private void test1(View view) {
        signSeekBar1 = (SignSeekBar) view.findViewById(R.id.demo_6_seek_bar_1);
        signSeekBar1.getConfigBuilder()
                .setUnit("m<sup>2</sup>")
                .build();
    }

//    //格式化进度显示
//    private void test2(View view) {
//        SignSeekBar signSeekBar = (SignSeekBar) view.findViewById(R.id.demo_6_seek_bar_2);
//        signSeekBar.getConfigBuilder()
//                .format(new DecimalFormat("#,###"))//采用的是NumberFormat 注意NumberFormat/DecimalFormat语法格式
//                .setUnit("IDR")
//                .reverse()//进度单位是否反转，正常：10s 反转后：s10
//                .build();
//    }
//
//    //格式化进度显示-另一种方式 完全自定义进度
//    private void test3(View view) {
//        SignSeekBar signSeekBar = (SignSeekBar) view.findViewById(R.id.demo_6_seek_bar_3);
//        signSeekBar.setValueFormatListener(new SignSeekBar.OnValueFormatListener() {
//            @Override
//            public String format(float progress) {
//                //return new DecimalFormat("#,###").format(progress);
//                return "IDR" + new DecimalFormat("#,###").format(progress) + " s";
//            }
//        });
//    }

}
