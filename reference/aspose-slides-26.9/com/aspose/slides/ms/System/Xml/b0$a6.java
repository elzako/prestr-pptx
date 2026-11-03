package com.aspose.slides.ms.System.Xml;

class b0$a6 implements Comparable {
   private static volatile b0$a6 t9;
   public int n5;
   public String l6;
   public String k5;
   public String u3;
   public String a6;
   private String z1;
   private char[] t4;
   private int q0;
   private int z3;
   public y0 u9 = new y0();
   public y0 h0 = new y0();
   public char c8;
   public int t2;
   private boolean m1;
   public int s7;
   public boolean x8;
   public b0$a6 n3;
   public Object y4;
   public Object e2;

   public static b0$a6 n5() {
      if (t9 == null) {
         t9 = new b0$a6();
      }

      return t9;
   }

   public b0$a6() {
      this.n5(0);
      this.x8 = false;
   }

   public final int l6() {
      return this.u9.n5;
   }

   public final int k5() {
      return this.u9.l6;
   }

   public final boolean u3() {
      return this.n5 == 1 && this.m1;
   }

   public final void n5(boolean var1) {
      this.m1 = var1;
   }

   public final boolean a6() {
      return this.n5 == 2 && this.m1;
   }

   public final void l6(boolean var1) {
      this.m1 = var1;
   }

   public final boolean u9() {
      return this.z1 == null;
   }

   public final String h0() {
      if (this.z1 == null) {
         this.z1 = com.aspose.slides.ms.System.d1.n5(this.t4, this.q0, this.z3);
      }

      return this.z1;
   }

   public final void c8() {
      if (this.u9()) {
         int[] var1 = new int[]{this.z3};
         b0.n5(this.t4, this.q0, var1);
         this.z3 = var1[0];
      } else {
         this.z1 = b0.h0(this.z1);
      }
   }

   public final void n5(int var1) {
      this.n5 = var1;
      this.t2();
      this.z1 = com.aspose.slides.ms.System.d1.n5;
      this.q0 = -1;
      this.a6 = com.aspose.slides.ms.System.d1.n5;
      this.y4 = null;
      this.e2 = null;
   }

   public final void t2() {
      this.l6 = com.aspose.slides.ms.System.d1.n5;
      this.k5 = com.aspose.slides.ms.System.d1.n5;
      this.u3 = com.aspose.slides.ms.System.d1.n5;
      this.a6 = com.aspose.slides.ms.System.d1.n5;
   }

   public final void n5(int var1, int var2) {
      this.u9.n5(var1, var2);
   }

   public final void l6(int var1, int var2) {
      this.h0.n5(var1, var2);
   }

   public final void n5(int var1, String var2) {
      this.n5 = var1;
      this.t2();
      this.z1 = var2;
      this.q0 = -1;
   }

   public final void n5(int var1, char[] var2, int var3, int var4) {
      this.n5 = var1;
      this.t2();
      this.z1 = null;
      this.t4 = var2;
      this.q0 = var3;
      this.z3 = var4;
   }

   public final void l6(int var1, String var2) {
      this.n5(var1, var2, com.aspose.slides.ms.System.d1.n5, var2);
   }

   public final void n5(int var1, String var2, String var3, String var4) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.a6 = var4;
      this.u3 = com.aspose.slides.ms.System.d1.n5;
      this.z1 = com.aspose.slides.ms.System.d1.n5;
      this.q0 = -1;
   }

   public final void n5(String var1) {
      this.q0 = -1;
      this.z1 = var1;
   }

   public final void n5(char[] var1, int var2, int var3) {
      this.z1 = null;
      this.t4 = var1;
      this.q0 = var2;
      this.z3 = var3;
   }

   public final void s7() {
      if (this.z1 == null) {
         this.z1 = com.aspose.slides.ms.System.d1.n5(this.t4, this.q0, this.z3);
      }

      this.q0 = -1;
   }

   public final void n5(int var1, com.aspose.slides.internal.l7h.a5 var2) {
      if (this.z1 == null) {
         var2.n5(this.t4, this.q0 + var1, this.z3 - var1);
      } else if (var1 <= 0) {
         var2.n5(this.z1);
      } else {
         var2.n5(this.z1, var1, this.z1.length() - var1);
      }
   }

   public final int l6(int var1, char[] var2, int var3, int var4) {
      if (this.z1 == null) {
         int var6 = this.z3 - var1;
         if (var6 > var4) {
            var6 = var4;
         }

         b0.n5(this.t4, this.q0 + var1, var2, var3, var6);
         return var6;
      } else {
         int var5 = this.z1.length() - var1;
         if (var5 > var4) {
            var5 = var4;
         }

         com.aspose.slides.ms.System.d1.n5(this.z1, var1, var2, var3, var5);
         return var5;
      }
   }

   public final String n5(z9 var1) {
      return this.a6 != null ? this.a6 : this.l6(var1);
   }

   public final String l6(z9 var1) {
      if (this.k5.length() == 0) {
         this.a6 = this.l6;
      } else {
         this.a6 = var1.n5(com.aspose.slides.ms.System.d1.n5(new String[]{this.k5, ":", this.l6}));
      }

      return this.a6;
   }

   @Override
   public final int compareTo(Object obj) {
      b0$a6 var2 = com.aspose.slides.internal.v6g.k5.n5(obj, b0$a6.class);
      if (var2 != null) {
         if (v8.n5(this.l6, var2.l6)) {
            return v8.n5(this.u3, var2.u3) ? 0 : com.aspose.slides.ms.System.d1.h0(this.u3, var2.u3);
         } else {
            return com.aspose.slides.ms.System.d1.h0(this.l6, var2.l6);
         }
      } else {
         return 1;
      }
   }
}
