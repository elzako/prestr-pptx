package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class a3p extends s3 {
   private String n5;
   private String l6;
   private int[] k5;
   private int[] u3;
   private int a6;
   private int u9;
   private boolean h0 = false;
   private boolean c8 = true;
   private int t2 = 1;
   private boolean s7;
   private String x8;
   private String n3;
   private static final com.aspose.slides.internal.n8e.e2 y4 = new com.aspose.slides.internal.n8e.e2(
      "auto", "bCtr", "bL", "bR", "ctr", "midL", "midR", "tCtr", "tL", "tR", "radial"
   );

   public final String k5() {
      return this.n5;
   }

   public final String u3() {
      return this.l6;
   }

   public final int a6() {
      return this.t2;
   }

   public final int[] u9() {
      return this.k5;
   }

   public final int[] h0() {
      return this.u3;
   }

   public final int c8() {
      return this.a6;
   }

   public final int t2() {
      return this.u9;
   }

   public final boolean s7() {
      return this.h0;
   }

   public final boolean x8() {
      return this.c8;
   }

   public a3p(com.aspose.slides.internal.k4y.p5i var1) {
      this.k5 = new int[]{1, 5, 6, 7};
      this.u3 = new int[]{1, 5, 6, 7};
      this.a6 = 0;

      for (com.aspose.slides.internal.k4y.s6m var5 : var1.l6()) {
         if (var5.n5() == 44) {
            this.n5 = var5.l6();
         } else if (var5.n5() == 14) {
            this.l6 = var5.l6();
         } else if (var5.n5() == 3) {
            this.k5 = com.aspose.slides.internal.n8e.v4.k5(this.h0(var5.l6()));
         } else if (var5.n5() == 15) {
            this.u3 = com.aspose.slides.internal.n8e.v4.k5(this.h0(var5.l6()));
         } else if (var5.n5() == 10) {
            this.a6 = this.c8(var5.l6());
         } else if (var5.n5() == 4) {
            this.h0 = this.u3(var5.l6());
         } else if (var5.n5() == 16) {
            this.c8 = this.u3(var5.l6());
         } else if (var5.n5() == 13) {
            this.t2 = this.a6(var5.l6());
         } else if (var5.n5() == 0) {
            this.s7 = com.aspose.slides.ms.System.z3.n5(var5.l6());
         } else if (var5.n5() == 21) {
            this.x8 = var5.l6();
         } else if (var5.n5() == 54) {
            this.n3 = var5.l6();
         } else if (var5.n5() == 5) {
            this.u9 = this.u9(var5.l6());
         }
      }
   }

   private boolean u3(String var1) {
      return "arr".equals(var1);
   }

   private int a6(String var1) {
      if ("1D".equals(var1)) {
         return 0;
      } else if ("2D".equals(var1)) {
         return 1;
      } else {
         return "custom".equals(var1) ? 2 : 1;
      }
   }

   private int u9(String var1) {
      if ("beg".equals(var1)) {
         return 1;
      } else {
         return "end".equals(var1) ? 2 : 0;
      }
   }

   private List<Integer> h0(String var1) {
      List var2 = new List();
      String[] var3 = com.aspose.slides.ms.System.d1.n5(com.aspose.slides.ms.System.d1.n5(var1, ',', ' '), ' ');

      for (int var4 = 0; var4 < var3.length; var4++) {
         String var5 = com.aspose.slides.ms.System.d1.l6(var3[var4]);
         if (y4.l6(var5)) {
            var2.addItem(y4.n5(var5));
         }
      }

      if (var2.size() == 0) {
         var2.addItem(0);
      }

      return var2;
   }

   private int c8(String var1) {
      if ("bend".equals(var1)) {
         return 1;
      } else if ("curve".equals(var1)) {
         return 2;
      } else {
         return "longCurve".equals(var1) ? 3 : 0;
      }
   }
}
