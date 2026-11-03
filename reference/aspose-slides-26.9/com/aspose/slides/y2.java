package com.aspose.slides;

class y2 extends x3 {
   private String n5;
   private long l6;
   private boolean k5;
   private int u3;

   public final long n5() {
      return this.l6;
   }

   public final void n5(long var1) {
      this.l6 = var1;
      this.k5 = false;
   }

   public final float l6() {
      return (float)(this.l6 / 60000.0);
   }

   public final void n5(float var1) {
      this.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(var1 * 60000.0), 14));
   }

   public final String k5() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final int u3() {
      return this.u3;
   }

   public final boolean a6() {
      return this.k5;
   }

   public final void n5(boolean var1) {
      this.k5 = var1;
   }

   public final void l6(String var1) {
      if (var1.charAt(0) != 'v' && var1.charAt(1) != 'a' && var1.charAt(2) != 'l' && var1.charAt(3) != ' ') {
         throw new PptxReadException(com.aspose.slides.ms.System.d1.n5("Error reading adjustment value: {0} = \"{1}\"",new Object[]{ this.n5, var1}));
      }

      int var2 = 4;

      while (var2 < var1.length() && var1.charAt(var2) == ' ') {
         var2++;
      }

      this.l6 = com.aspose.slides.ms.System.Xml.f4.t9(com.aspose.slides.ms.System.d1.k5(var1, var2));
   }

   public y2(String var1, long var2) {
      this.n5 = var1;
      this.l6 = var2;
      this.u3 = 0;
   }

   public y2(String var1, long var2, int var4) {
      this.n5 = var1;
      this.l6 = var2;
      this.u3 = var4;
   }

   public y2(y2 var1) {
      this.n5 = var1.k5();
      this.l6 = var1.n5();
      this.u3 = var1.u3;
      this.k5 = true;
   }

   public y2(String var1, String var2) {
      this.n5 = var1;
      this.l6(var2);
   }

   public y2(String var1, String var2, y2[] var3) {
      this.n5 = var1;
      if (var3 != null) {
         for (y2 var7 : var3) {
            if (com.aspose.slides.ms.System.d1.a6(var7.k5(), var1)) {
               this.u3 = var7.u3();
               break;
            }
         }
      }

      this.l6(var2);
   }
}
