package com.aspose.slides.internal.c8m;

import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.internal.b8c.k0t;

public class z3 extends u6 {
   public static final w4 n5 = new w4("http://schemas.openxmlformats.org/officeDocument/2006/relationships/chart");
   public static final String[] l6 = new String[]{""};
   public static final k0t k5 = n5(l6);
   private static final SortedList<String, String> u3 = new SortedList<>();

   @Override
   public SortedList<String, String> a6() {
      return u3;
   }

   @Override
   public String n5() {
      return "application/vnd.openxmlformats-officedocument.drawingml.chart+xml";
   }

   @Override
   public w4 l6() {
      return n5;
   }

   @Override
   public k0t u3() {
      return k5;
   }

   static {
      u3.addItem("c14", "http://schemas.microsoft.com/office/drawing/2007/8/2/chart");
   }
}
