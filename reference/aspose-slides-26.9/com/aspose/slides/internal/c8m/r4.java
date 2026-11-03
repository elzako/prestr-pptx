package com.aspose.slides.internal.c8m;

import com.aspose.slides.Collections.Generic.SortedList;

public abstract class r4 extends v7 {
   private static final SortedList<String, String> n5 = new SortedList<>();

   @Override
   public SortedList<String, String> a6() {
      return n5;
   }

   static {
      n5.addItem("p14", "http://schemas.microsoft.com/office/powerpoint/2010/main");
      n5.addItem("p15", "http://schemas.microsoft.com/office/powerpoint/2012/main");
      n5.addItem("p159", "http://schemas.microsoft.com/office/powerpoint/2015/09/main");
      n5.addItem("a14", "http://schemas.microsoft.com/office/drawing/2010/main");
      n5.addItem("p188", "http://schemas.microsoft.com/office/powerpoint/2018/8/main");
   }
}
