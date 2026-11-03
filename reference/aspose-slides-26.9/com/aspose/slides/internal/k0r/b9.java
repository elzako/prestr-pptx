package com.aspose.slides.internal.k0r;

public class b9 extends r4 implements x3 {
   private static final int[] n5 = new int[]{4049, Integer.MAX_VALUE, 4035, Integer.MAX_VALUE, 4026, 1, 4026, 2, 4026, 3, 4033, Integer.MAX_VALUE};

   public b9() {
      this.w1().n5(4046);
      this.e2().addItem(new m8());
      this.e2().addItem(new r6());
      this.e2().addItem(new z1("Object", (short)1));
      this.e2().addItem(new z1("Object", (short)2));
      this.e2().addItem(new z1("Object", (short)3));
   }

   public b9(int var1) {
      this.w1().n5(4046);
   }

   public final m8 l6() {
      return (m8)this.k5(4049);
   }

   @Override
   public final r6 u3() {
      return (r6)this.k5(4035);
   }

   @Override
   public final z1 a6() {
      return this.l6((short)1);
   }

   @Override
   public final z1 u9() {
      return this.l6((short)2);
   }

   @Override
   public final z1 h0() {
      return this.l6((short)3);
   }

   public final n6 c8() {
      return (n6)this.k5(4033);
   }

   @Override
   protected int[] k5() {
      return n5;
   }
}
