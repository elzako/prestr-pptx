package com.aspose.slides;

class s8z {
   public final y6x n5;

   public s8z(int var1, int var2, boolean var3, int var4) {
      this.n5 = new y6x(var1, var2, var3, var4);
   }

   public final String n5(String var1, int var2, int var3) {
      return com.aspose.slides.ms.System.d1.n5("{0}{1}{2}",new Object[]{ com.aspose.slides.ms.System.d1.n5(' ', var2), var1, com.aspose.slides.ms.System.d1.n5(' ', var3)});
   }

   public final String n5(String var1) {
      return com.aspose.slides.ms.System.d1.n5("**{0}**", new Object[]{var1});
   }

   public final String n5(String var1, float var2) {
      if (var2 <= 0.0F) {
         return var1;
      }

      int var3;
      if (var2 > 36.0F) {
         var3 = 1;
      } else {
         var3 = 6 - com.aspose.slides.internal.v6g.k5.u3(var2 / 6.0F, 13);
      }

      return this.k5(var1, var3);
   }

   public final String n5(String var1, String var2) {
      return com.aspose.slides.ms.System.d1.n5(this.n5.a6(),new Object[]{ var1, var2});
   }

   public final String l6(String var1) {
      return com.aspose.slides.ms.System.d1.n5(this.n5.u9(), new Object[]{var1});
   }

   public final String l6(String var1, String var2) {
      return com.aspose.slides.ms.System.d1.n5(this.n5.c8(),new Object[]{ var1, var2});
   }

   public final String n5(String var1, int var2) {
      return this.n5(this.n5.t9(), var1, this.n5.e2(), var2);
   }

   public final String k5(String var1) {
      return com.aspose.slides.ms.System.d1.n5(this.n5.z1(), new Object[]{var1});
   }

   public final String k5(String var1, String var2) {
      return com.aspose.slides.ms.System.d1.n5(this.n5.x8(),new Object[]{ var1, var2});
   }

   public final String u3(String var1, String var2) {
      return com.aspose.slides.ms.System.d1.n5(this.n5.n3(),new Object[]{ var1, var2});
   }

   public final String u3(String var1) {
      return com.aspose.slides.ms.System.d1.n5("{0}  {1}",new Object[]{ var1, this.n5.y4()});
   }

   public final String a6(String var1) {
      return com.aspose.slides.ms.System.d1.n5(this.n5.t4(), new Object[]{var1});
   }

   public final String l6(String var1, int var2) {
      return this.n5(this.n5.z3(), var1, this.n5.q0(), var2);
   }

   public final String u9(String var1) {
      return com.aspose.slides.ms.System.d1.n5(this.n5.h0(), new Object[]{var1});
   }

   public final String k5(String var1, int var2) {
      String var3 = com.aspose.slides.ms.System.d1.n5(this.n5.k5(), var2);
      return com.aspose.slides.ms.System.d1.n5("{0} {1}",new Object[]{ var3, var1});
   }

   public final String h0(String var1) {
      return com.aspose.slides.ms.System.d1.n5("{1}{0}  {1}",new Object[]{ var1, this.n5.y4()});
   }

   public final String n5() {
      return this.n5.u3();
   }

   public final String a6(String var1, String var2) {
      return com.aspose.slides.ms.System.d1.n5("{0}: \"{1}\"",new Object[]{ var1, var2});
   }

   public final String l6() {
      return this.n5.t2();
   }

   public final boolean n5(int var1) {
      return (this.n5.l6() & var1) == 0;
   }

   public final String k5() {
      return this.n5.y4();
   }

   public final String c8(String var1) {
      return c2h.n5(var1, this.n5());
   }

   public final String n5(String var1, byte var2, boolean[] var3) {
      var3[0] = false;
      switch (var2) {
         case 0:
         case 2:
            var3[0] = true;
            return this.n5(var1, 40.0F);
         case 1:
         case 4:
         case 5:
         default:
            return var1;
         case 3:
            var3[0] = true;
            return this.n5(var1, 24.0F);
         case 6:
         case 7:
            var3[0] = true;
            return this.n5(var1, 10.0F);
      }
   }

   private String n5(String var1, String var2, char var3, int var4) {
      String var5 = com.aspose.slides.ms.System.d1.n5(var3, var4 * this.n5.s7());
      return com.aspose.slides.ms.System.d1.n5(var1,new Object[]{ var5, var2});
   }
}
