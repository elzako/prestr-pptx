package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public final class d4r extends b3 {
   private int n5 = 0;
   private String l6;
   private String k5;
   private g7 u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9(
      "intervalClosed", "underflow", "overflow", "binSize", "binCount"
   );

   public d4r(com.aspose.slides.ms.System.Xml.c7 var1) {
      this();

      while (var1.u3()) {
         if (!"xmlns".equals(var1.e2())) {
            switch (a6.n5(k5(var1))) {
               case 0:
                  this.n5 = d1g.n5(var1.z1());
                  break;
               case 1:
                  this.l6 = var1.z1();
                  break;
               case 2:
                  this.k5 = var1.z1();
            }
         }
      }

      var1.a6();
      n5(var1, new d4r$1(this, var1));
   }

   public d4r() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != 0) {
         var2.l6("intervalClosed", d1g.n5(this.n5));
      }

      if (this.l6 != null) {
         var2.l6("underflow", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("overflow", this.k5);
      }

      if (this.u3 != null) {
         switch (a6.n5(this.u3.n5())) {
            case 3:
               var2.n5("cx", "binSize", null);
               var2.l6("val", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(this.u3.k5(), double.class).doubleValue()));
               var2.s7();
               break;
            case 4:
               var2.n5("cx", "binCount", null);
               var2.l6("val", com.aspose.slides.ms.System.Xml.f4.l6(com.aspose.slides.internal.v6g.k5.u3(this.u3.k5(), long.class).longValue()));
               var2.s7();
         }
      }

      var2.s7();
   }

   public final g7 n5(String var1) {
      if (this.u3 != null) {
         throw new Exception("Value already is initialized.");
      }

      switch (a6.n5(var1)) {
         case 3:
            this.u3 = new g7("binSize", (Double)com.aspose.slides.internal.v6g.k5.k5(double.class));
            break;
         case 4:
            this.u3 = new g7("binCount", (Long)com.aspose.slides.internal.v6g.k5.k5(long.class));
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.u3;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final String n5() {
      return this.l6;
   }

   public final void l6(String var1) {
      this.l6 = var1;
   }

   public final String l6() {
      return this.k5;
   }

   public final void k5(String var1) {
      this.k5 = var1;
   }

   public final g7 k5() {
      return this.u3;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return a6;
   }

   // $VF: synthetic method
   static g7 n5(d4r var0, g7 var1) {
      return var0.u3 = var1;
   }
}
