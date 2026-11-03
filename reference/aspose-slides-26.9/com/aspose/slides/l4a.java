package com.aspose.slides;

class l4a {
   private int l6;
   private int k5;
   private int u3;
   private int a6;
   private final ChartDataWorksheet u9;
   private final f3w h0 = new f3w();
   q4e n5;
   private static final com.aspose.slides.internal.v6g.u9 c8 = new com.aspose.slides.internal.v6g.u9("#All", "#Headers", "#Totals", "#This Row");

   final ChartDataWorksheet n5() {
      return this.u9;
   }

   final int l6() {
      return this.l6;
   }

   final void n5(int var1) {
      this.l6 = var1;
   }

   final int k5() {
      return this.k5;
   }

   final void l6(int var1) {
      this.k5 = var1;
   }

   final int u3() {
      return this.u3;
   }

   final void k5(int var1) {
      this.u3 = var1;
   }

   final int a6() {
      return this.a6;
   }

   final void u3(int var1) {
      this.a6 = var1;
   }

   final f3w u9() {
      return this.h0;
   }

   final String h0() {
      String var1 = this.u9.l6().l6(this.u3, this.l6).a6();
      String var2 = this.u9.l6().l6(this.a6, this.k5).a6();
      return com.aspose.slides.ms.System.d1.n5(new String[]{var1, ":", var2});
   }

   final String n5(String var1, String var2, String var3, int var4) {
      int var5 = this.l6;
      int var6 = this.k5;
      if (!com.aspose.slides.ms.System.d1.n5(var2)) {
         int var7 = this.n5(var2);
         if (var7 != -1) {
            var5 = var7;
         }
      }

      if (!com.aspose.slides.ms.System.d1.n5(var3)) {
         int var11 = this.n5(var3);
         if (var11 != -1) {
            var6 = var11;
         }
      }

      boolean var8 = var5 == var6;
      String var9;
      String var10;
      switch (c8.n5(var1)) {
         case 0:
            var9 = this.u9.l6().l6(this.u3, var5).a6();
            var10 = this.u9.l6().l6(this.a6, var6).a6();
            break;
         case 1:
            var9 = this.u9.l6().l6(this.u3, var5).a6();
            if (var8) {
               return var9;
            }

            var10 = this.u9.l6().l6(this.u3, var6).a6();
            break;
         case 2:
            if (!this.h0.s7()) {
               return null;
            }

            var9 = this.u9.l6().l6(this.a6, var5).a6();
            if (var8) {
               return var9;
            }

            var10 = this.u9.l6().l6(this.a6, var6).a6();
            break;
         case 3:
            var9 = this.u9.l6().l6(var4 - 1, var5).a6();
            if (var8) {
               return var9;
            }

            var10 = this.u9.l6().l6(var4 - 1, var6).a6();
            break;
         default:
            var9 = this.u9.l6().l6(this.u3 + (int)this.h0.u9(), var5).a6();
            var10 = this.u9.l6().l6(this.a6 - (int)this.h0.t2(), var6).a6();
      }

      return com.aspose.slides.ms.System.d1.n5("{0}:{1}",new Object[]{ var9, var10});
   }

   private int n5(String var1) {
      com.aspose.slides.internal.k4y.b6o[] var2 = this.h0.j5().l6();

      for (com.aspose.slides.internal.k4y.b6o var6 : var2) {
         if (com.aspose.slides.ms.System.d1.a6(var6.l6(), var1)) {
            return (int)var6.n5() - 1;
         }
      }

      return -1;
   }

   l4a(ChartDataWorksheet var1) {
      this.u9 = var1;
   }

   l4a(ChartDataWorksheet var1, String var2) {
      this.u9 = var1;
      if (!com.aspose.slides.ms.System.d1.n5(var2)) {
         String[] var3 = com.aspose.slides.ms.System.d1.n5(var2, ':');
         int[] var4 = new int[]{this.l6};
         int[] var5 = new int[]{this.u3};
         ChartDataWorkbook.n5(var3[0], var4, var5);
         this.l6 = var4[0];
         this.u3 = var5[0];
         int[] var6 = new int[]{this.k5};
         int[] var7 = new int[]{this.a6};
         ChartDataWorkbook.n5(var3[1], var6, var7);
         this.k5 = var6[0];
         this.a6 = var7[0];
      }
   }

   l4a(ChartDataWorksheet var1, q4e var2) {
      this.u9 = var1;
      this.n5 = var2;
      if (var2.k5() != null) {
         String[] var3 = com.aspose.slides.ms.System.d1.n5(this.n5.k5().l6(), ':');
         int[] var4 = new int[]{this.l6};
         int[] var5 = new int[]{this.u3};
         ChartDataWorkbook.n5(var3[0], var4, var5);
         this.l6 = var4[0];
         this.u3 = var5[0];
         int[] var6 = new int[]{this.k5};
         int[] var7 = new int[]{this.a6};
         ChartDataWorkbook.n5(var3[1], var6, var7);
         this.k5 = var6[0];
         this.a6 = var7[0];
      }
   }
}
