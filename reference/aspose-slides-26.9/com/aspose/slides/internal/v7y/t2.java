package com.aspose.slides.internal.v7y;

public final class t2 extends v3 {
   private int n5;
   private j9 l6;
   private j9 u3;
   private static final t2$l6[][] a6 = new t2$l6[][]{
      {new s7(), null, null, null, null},
      {new k7(), new s3(), null, null, null},
      {new f2(), new i1(), new e5(), null, null},
      {new b3(), new o0(), new z7(), new x8(), null},
      {new n3(), new y4(), new e2(), new t9(), new z1()}
   };
   private static final t2$l6[][] u9 = new t2$l6[][]{
      {new t4(), null, null, null, null},
      {new q0(), new z3(), null, null, null},
      {new m1(), new m3(), new z8(), null, null},
      {new j5(), new w1(), new r4(), new y2(), null},
      {new y1(), new a0(), new d2(), new d5(), new p8()}
   };

   public t2(int var1, j9 var2, j9 var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.u3 = var3;
   }

   private t2(t2 var1) {
      super(var1);
      this.n5 = var1.n5;
      this.l6 = n5(var1.l6);
      this.u3 = n5(var1.u3);
   }

   @Override
   public void n5(com.aspose.slides.internal.k4s.h0 var1) {
      this.l6.n5(var1);
      this.u3.n5(var1);
   }

   @Override
   public Object n5(com.aspose.slides.internal.x6s.h0 var1) {
      int var2 = this.n5;
      Object var3 = this.l6.n5(var1);
      Object var4 = this.u3.n5(var1);
      int var5 = this.n5(var3);
      int var6 = this.n5(var4);
      if (var5 < var6) {
         var2 = a3.n5(var2);
         Object var7 = var3;
         var3 = var4;
         var4 = var7;
         int var8 = var5;
         var5 = var6;
         var6 = var8;
      }

      return var2 != 3 && var2 != 4 ? u9[var5][var6].n5(var2, var3, var4) : a6[var5][var6].n5(var2, var3, var4);
   }

   private static boolean c4(int var0, Object var1, Object var2) {
      boolean var3 = var0 == 3;
      t2$n5 var4 = new t2$n5(var1);
      t2$n5 var5 = new t2$n5(var2);

      label30:
      while (var4.n5()) {
         if (!var5.n5()) {
            return false;
         }

         String var6 = var4.k5();

         while (com.aspose.slides.ms.System.d1.a6(var6, var5.k5()) != var3) {
            if (!var5.n5()) {
               var5.l6();
               continue label30;
            }
         }

         return true;
      }

      return false;
   }

   private static boolean y2(int var0, Object var1, Object var2) {
      t2$n5 var3 = new t2$n5(var1);
      t2$n5 var4 = new t2$n5(var2);

      label25:
      while (var3.n5()) {
         if (!var4.n5()) {
            return false;
         }

         double var5 = a5.n5(var3.k5());

         while (!n5(var0, var5, a5.n5(var4.k5()))) {
            if (!var4.n5()) {
               var4.l6();
               continue label25;
            }
         }

         return true;
      }

      return false;
   }

   private static boolean y1(int var0, Object var1, Object var2) {
      t2$n5 var3 = new t2$n5(var1);
      double var4 = com.aspose.slides.internal.v6g.k5.u3(var2, double.class);

      while (var3.n5()) {
         if (n5(var0, a5.n5(var3.k5()), var4)) {
            return true;
         }
      }

      return false;
   }

   private static boolean a0(int var0, Object var1, Object var2) {
      t2$n5 var3 = new t2$n5(var1);
      String var4 = (String)var2;

      while (var3.n5()) {
         if (n5(var0, var3.k5(), var4)) {
            return true;
         }
      }

      return false;
   }

   private static boolean d2(int var0, Object var1, Object var2) {
      t2$n5 var3 = new t2$n5(var1);
      double var4 = a5.n5((String)var2);

      while (var3.n5()) {
         if (l6(var0, a5.n5(var3.k5()), var4)) {
            return true;
         }
      }

      return false;
   }

   private static boolean d5(int var0, Object var1, Object var2) {
      String var3 = l6(var1);
      t2$n5 var4 = new t2$n5(var2);

      while (var4.n5()) {
         if (n5(var0, var3, var4.k5())) {
            return true;
         }
      }

      return false;
   }

   private static boolean s3(int var0, Object var1, Object var2) {
      double var3 = a5.n5(l6(var1));
      t2$n5 var5 = new t2$n5(var2);

      while (var5.n5()) {
         if (l6(var0, var3, a5.n5(var5.k5()))) {
            return true;
         }
      }

      return false;
   }

   private static boolean p8(int var0, Object var1, Object var2) {
      t2$n5 var3 = new t2$n5(var1);
      boolean var4 = var3.n5();
      boolean var5 = com.aspose.slides.internal.v6g.k5.u3(var2, boolean.class);
      return n5(var0, var4, var5);
   }

   private static boolean f2(int var0, Object var1, Object var2) {
      t2$n5 var3 = new t2$n5(var1);
      double var4 = var3.n5() ? 1.0 : 0.0;
      double var6 = a5.n5((boolean)(com.aspose.slides.internal.v6g.k5.u3(var2, boolean.class)));
      return l6(var0, var4, var6);
   }

   private static boolean n5(int var0, boolean var1, boolean var2) {
      return var0 == 3 == (var1 == var2);
   }

   private static boolean i1(int var0, Object var1, Object var2) {
      boolean var3 = com.aspose.slides.internal.v6g.k5.u3(var1, boolean.class);
      boolean var4 = com.aspose.slides.internal.v6g.k5.u3(var2, boolean.class);
      return n5(var0, var3, var4);
   }

   private static boolean e5(int var0, Object var1, Object var2) {
      double var3 = a5.n5((boolean)(com.aspose.slides.internal.v6g.k5.u3(var1, boolean.class)));
      double var5 = a5.n5((boolean)(com.aspose.slides.internal.v6g.k5.u3(var2, boolean.class)));
      return l6(var0, var3, var5);
   }

   private static boolean b3(int var0, Object var1, Object var2) {
      boolean var3 = com.aspose.slides.internal.v6g.k5.u3(var1, boolean.class);
      boolean var4 = u8.n5((double)(com.aspose.slides.internal.v6g.k5.u3(var2, double.class)));
      return n5(var0, var3, var4);
   }

   private static boolean o0(int var0, Object var1, Object var2) {
      double var3 = a5.n5((boolean)(com.aspose.slides.internal.v6g.k5.u3(var1, boolean.class)));
      double var5 = com.aspose.slides.internal.v6g.k5.u3(var2, double.class);
      return l6(var0, var3, var5);
   }

   private static boolean z7(int var0, Object var1, Object var2) {
      boolean var3 = com.aspose.slides.internal.v6g.k5.u3(var1, boolean.class);
      boolean var4 = u8.n5((String)var2);
      return n5(var0, var3, var4);
   }

   private static boolean v4(int var0, Object var1, Object var2) {
      boolean var3 = u8.n5(l6(var1));
      boolean var4 = com.aspose.slides.internal.v6g.k5.u3(var2, boolean.class);
      return n5(var0, var3, var4);
   }

   private static boolean u6(int var0, Object var1, Object var2) {
      return l6(var0, a5.n5((boolean)(com.aspose.slides.internal.v6g.k5.u3(var1, boolean.class))), a5.n5((String)var2));
   }

   private static boolean t1(int var0, Object var1, Object var2) {
      return l6(var0, a5.n5(l6(var1)), a5.n5((boolean)(com.aspose.slides.internal.v6g.k5.u3(var2, boolean.class))));
   }

   private static boolean n5(int var0, double var1, double var3) {
      switch (var0) {
         case 3:
            return var1 == var3;
         case 4:
            return var1 != var3;
         case 5:
            return var1 < var3;
         case 6:
            return var1 <= var3;
         case 7:
            return var1 > var3;
         case 8:
            return var1 >= var3;
         default:
            com.aspose.slides.internal.f8y.n5.n5("Unexpected Operator.op code in cmpNumberNumber()");
            return false;
      }
   }

   private static boolean l6(int var0, double var1, double var3) {
      switch (var0) {
         case 5:
            return var1 < var3;
         case 6:
            return var1 <= var3;
         case 7:
            return var1 > var3;
         case 8:
            return var1 >= var3;
         default:
            com.aspose.slides.internal.f8y.n5.n5("Unexpected Operator.op code in cmpNumberNumberO()");
            return false;
      }
   }

   private static boolean a5(int var0, Object var1, Object var2) {
      double var3 = com.aspose.slides.internal.v6g.k5.u3(var1, double.class);
      double var5 = com.aspose.slides.internal.v6g.k5.u3(var2, double.class);
      return n5(var0, var3, var5);
   }

   private static boolean h2(int var0, Object var1, Object var2) {
      double var3 = com.aspose.slides.internal.v6g.k5.u3(var2, double.class);
      double var5 = a5.n5((String)var1);
      return n5(var0, var5, var3);
   }

   private static boolean v0(int var0, Object var1, Object var2) {
      double var3 = com.aspose.slides.internal.v6g.k5.u3(var2, double.class);
      double var5 = a5.n5(l6(var1));
      return n5(var0, var5, var3);
   }

   private static boolean n5(int var0, String var1, String var2) {
      return var0 == 3 == com.aspose.slides.ms.System.d1.a6(var1, var2);
   }

   private static boolean f0(int var0, Object var1, Object var2) {
      String var3 = (String)var1;
      String var4 = (String)var2;
      return n5(var0, var3, var4);
   }

   private static boolean a3(int var0, Object var1, Object var2) {
      String var3 = l6(var1);
      String var4 = (String)var2;
      return n5(var0, var3, var4);
   }

   private static boolean p3(int var0, Object var1, Object var2) {
      String var3 = l6(var1);
      String var4 = l6(var2);
      return n5(var0, var3, var4);
   }

   private static boolean x9(int var0, Object var1, Object var2) {
      double var3 = a5.n5((String)var1);
      double var5 = a5.n5((String)var2);
      return l6(var0, var3, var5);
   }

   private static boolean y0(int var0, Object var1, Object var2) {
      double var3 = a5.n5(l6(var1));
      double var5 = a5.n5((String)var2);
      return l6(var0, var3, var5);
   }

   private static boolean j9(int var0, Object var1, Object var2) {
      double var3 = a5.n5(l6(var1));
      double var5 = a5.n5(l6(var2));
      return l6(var0, var3, var5);
   }

   @Override
   public com.aspose.slides.internal.x6s.h0 n5() {
      return new t2(this);
   }

   private static String l6(Object var0) {
      return ((com.aspose.slides.internal.x6s.a6)var0).c8();
   }

   @Override
   public int u9() {
      return 2;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public com.aspose.slides.internal.x6s.h0 deepClone() {
      return this.n5();
   }


   // $VF: synthetic method
   static boolean n5(int var0, Object var1, Object var2) {
      return a5(var0, var1, var2);
   }

   // $VF: synthetic method
   static boolean l6(int var0, Object var1, Object var2) {
      return h2(var0, var1, var2);
   }

   // $VF: synthetic method
   static boolean k5(int var0, Object var1, Object var2) {
      return f0(var0, var1, var2);
   }

   // $VF: synthetic method
   static boolean u3(int var0, Object var1, Object var2) {
      return b3(var0, var1, var2);
   }

   // $VF: synthetic method
   static boolean a6(int var0, Object var1, Object var2) {
      return z7(var0, var1, var2);
   }

   // $VF: synthetic method
   static boolean u9(int var0, Object var1, Object var2) {
      return i1(var0, var1, var2);
   }

   // $VF: synthetic method
   static boolean h0(int var0, Object var1, Object var2) {
      return y1(var0, var1, var2);
   }

   // $VF: synthetic method
   static boolean c8(int var0, Object var1, Object var2) {
      return a0(var0, var1, var2);
   }

   // $VF: synthetic method
   static boolean t2(int var0, Object var1, Object var2) {
      return p8(var0, var1, var2);
   }

   // $VF: synthetic method
   static boolean s7(int var0, Object var1, Object var2) {
      return c4(var0, var1, var2);
   }

   // $VF: synthetic method
   static boolean x8(int var0, Object var1, Object var2) {
      return v0(var0, var1, var2);
   }

   // $VF: synthetic method
   static boolean n3(int var0, Object var1, Object var2) {
      return a3(var0, var1, var2);
   }

   // $VF: synthetic method
   static boolean y4(int var0, Object var1, Object var2) {
      return v4(var0, var1, var2);
   }

   // $VF: synthetic method
   static boolean e2(int var0, Object var1, Object var2) {
      return d5(var0, var1, var2);
   }

   // $VF: synthetic method
   static boolean t9(int var0, Object var1, Object var2) {
      return p3(var0, var1, var2);
   }

   // $VF: synthetic method
   static boolean z1(int var0, Object var1, Object var2) {
      return x9(var0, var1, var2);
   }

   // $VF: synthetic method
   static boolean t4(int var0, Object var1, Object var2) {
      return o0(var0, var1, var2);
   }

   // $VF: synthetic method
   static boolean q0(int var0, Object var1, Object var2) {
      return u6(var0, var1, var2);
   }

   // $VF: synthetic method
   static boolean z3(int var0, Object var1, Object var2) {
      return e5(var0, var1, var2);
   }

   // $VF: synthetic method
   static boolean m1(int var0, Object var1, Object var2) {
      return d2(var0, var1, var2);
   }

   // $VF: synthetic method
   static boolean k7(int var0, Object var1, Object var2) {
      return f2(var0, var1, var2);
   }

   // $VF: synthetic method
   static boolean m3(int var0, Object var1, Object var2) {
      return y2(var0, var1, var2);
   }

   // $VF: synthetic method
   static boolean z8(int var0, Object var1, Object var2) {
      return y0(var0, var1, var2);
   }

   // $VF: synthetic method
   static boolean j5(int var0, Object var1, Object var2) {
      return t1(var0, var1, var2);
   }

   // $VF: synthetic method
   static boolean w1(int var0, Object var1, Object var2) {
      return s3(var0, var1, var2);
   }

   // $VF: synthetic method
   static boolean r4(int var0, Object var1, Object var2) {
      return j9(var0, var1, var2);
   }
}
