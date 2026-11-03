package com.aspose.slides.internal.k0r;

public class e5 extends r4 {
   private o0 n5;
   private static final int[] l6 = new int[]{5000, Integer.MAX_VALUE, 1044, 1, 1043, 1, 1031, 1, 1018, 0, 1018, 1, 1032, 1, 1023, 1};

   public e5() {
      this.w1().n5(2000);
   }

   public final void l6() {
      o1 var1 = new o1();
      var1.l6();
      var1.w1().n5((byte)15);
      var1.w1().n5((short)1);
      this.e2().addItem(var1);
      h3r var2 = new h3r();
      var2.l6();
      var2.w1().n5((byte)15);
      var2.w1().n5((short)0);
      this.e2().addItem(var2);
      h3r var3 = new h3r();
      var3.l6();
      var3.w1().n5((byte)15);
      var3.w1().n5((short)1);
      this.e2().addItem(var3);
      k1 var4 = new k1();
      var4.l6();
      var4.w1().n5((byte)15);
      var4.w1().n5((short)1);
      this.e2().addItem(var4);
      e2o var5 = new e2o();
      var5.l6();
      var5.w1().n5((short)1);
      this.e2().addItem(var5);
      o0 var6 = new o0();
      var6.n5(0);
      var6.w1().n5((byte)15);
      var6.w1().n5((short)0);
      this.e2().addItem(var6);
   }

   public final o0 u3() {
      if (this.n5 != null) {
         return this.n5;
      }

      this.n5 = (o0)this.k5(5000);
      if (this.n5 == null && this.n3()) {
         this.n5 = new o0();
         this.n5.l6(true);
         this.n5(this.n5);
      }

      return this.n5;
   }

   public final o1 a6() {
      return (o1)this.k5(1044);
   }

   public final k1 u9() {
      return (k1)this.k5(1043);
   }

   public final l9 h0() {
      return (l9)this.k5(1031);
   }

   public final h3r c8() {
      return (h3r)this.n5(1018, (short)0);
   }

   public final h3r t2() {
      return (h3r)this.n5(1018, (short)1);
   }

   public final b8c s7() {
      return (b8c)this.k5(1032);
   }

   public final e2o x8() {
      return (e2o)this.k5(1023);
   }

   @Override
   protected int[] k5() {
      return l6;
   }
}
