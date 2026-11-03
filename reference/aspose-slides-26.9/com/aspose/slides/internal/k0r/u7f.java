package com.aspose.slides.internal.k0r;

import com.aspose.slides.IGenericCloneable;

public class u7f extends w8d implements IGenericCloneable<u7f> {
   public final byte n5() {
      return this.l6(1);
   }

   public final void n5(byte var1) {
      this.n5(1, var1);
   }

   public final byte l6() {
      return this.l6(2);
   }

   public final void l6(byte var1) {
      this.n5(2, var1);
   }

   public final byte k5() {
      return this.l6(4);
   }

   public final void k5(byte var1) {
      this.n5(4, var1);
   }

   public final byte u3() {
      return this.l6(16);
   }

   public final void u3(byte var1) {
      this.n5(16, var1);
   }

   public final byte a6() {
      return this.l6(32);
   }

   public final void a6(byte var1) {
      this.n5(32, var1);
   }

   public final byte u9() {
      return this.l6(128);
   }

   public final void u9(byte var1) {
      this.n5(128, var1);
   }

   public final byte h0() {
      return this.l6(512);
   }

   public final void h0(byte var1) {
      this.n5(512, var1);
   }

   public final com.aspose.slides.ms.System.o5<Byte> c8() {
      return this.n5(15360)
         ? new com.aspose.slides.ms.System.o5<>((byte)((this.l6 & 15360 & 4294967295L) >> 10 & 4294967295L))
         : new com.aspose.slides.ms.System.o5<>();
   }

   public final void n5(com.aspose.slides.ms.System.o5<Byte> var1) {
      if (var1.l6()) {
         this.l6 = (this.l6 | 15360) ^ 15360;
         this.l6 = this.l6 | (int)(((Byte)var1.n5() & 0xFF & 15 & 4294967295L) << 10);
      }

      this.n5(15360, var1.l6());
   }

   public final com.aspose.slides.ms.System.o5<Integer> t2() {
      return this.n5(65536) ? new com.aspose.slides.ms.System.o5<>(this.k5) : new com.aspose.slides.ms.System.o5<>();
   }

   public final void l6(com.aspose.slides.ms.System.o5<Integer> var1) {
      if (var1.l6()) {
         this.k5 = (Integer)var1.n5();
      }

      this.n5(65536, var1.l6());
   }

   public final com.aspose.slides.ms.System.o5<Integer> s7() {
      return this.n5(2097152) ? new com.aspose.slides.ms.System.o5<>(this.u3) : new com.aspose.slides.ms.System.o5<>();
   }

   public final void k5(com.aspose.slides.ms.System.o5<Integer> var1) {
      if (var1.l6()) {
         this.u3 = (Integer)var1.n5();
      }

      this.n5(2097152, var1.l6());
   }

   public final com.aspose.slides.ms.System.o5<Integer> x8() {
      return this.n5(4194304) ? new com.aspose.slides.ms.System.o5<>(this.a6) : new com.aspose.slides.ms.System.o5<>();
   }

   public final void u3(com.aspose.slides.ms.System.o5<Integer> var1) {
      if (var1.l6()) {
         this.a6 = (Integer)var1.n5();
      }

      this.n5(4194304, var1.l6());
   }

   public final com.aspose.slides.ms.System.o5<Integer> n3() {
      return this.n5(8388608) ? new com.aspose.slides.ms.System.o5<>(this.u9) : new com.aspose.slides.ms.System.o5<>();
   }

   public final void a6(com.aspose.slides.ms.System.o5<Integer> var1) {
      if (var1.l6()) {
         this.u9 = (Integer)var1.n5();
      }

      this.n5(8388608, var1.l6());
   }

   public final com.aspose.slides.ms.System.o5<Short> y4() {
      return this.n5(131072) ? new com.aspose.slides.ms.System.o5<>(this.h0) : new com.aspose.slides.ms.System.o5<>();
   }

   public final void u9(com.aspose.slides.ms.System.o5<Short> var1) {
      if (var1.l6()) {
         this.h0 = (Short)var1.n5();
      }

      this.n5(131072, var1.l6());
   }

   public final m1 e2() {
      return this.n5(262144) ? this.c8 : null;
   }

   public final void n5(m1 var1) {
      this.c8 = var1;
      this.n5(262144, var1 != null);
   }

   public final com.aspose.slides.ms.System.o5<Short> t9() {
      return this.n5(524288) ? new com.aspose.slides.ms.System.o5<>(this.t2) : new com.aspose.slides.ms.System.o5<>();
   }

   public final void h0(com.aspose.slides.ms.System.o5<Short> var1) {
      if (var1.l6()) {
         this.t2 = (Short)var1.n5();
      }

      this.n5(524288, var1.l6());
   }

   public final boolean z1() {
      return this.n5(49480);
   }

   public final void n5(boolean var1) {
      this.n5(49480, var1);
   }

   @Override
   public void n5(w8d var1) {
      super.n5(var1);
      if (com.aspose.slides.internal.v6g.k5.l6(var1, u7f.class)) {
         u7f var2 = (u7f)var1;
         if (this.n5() == 0 && var2.n5() != 1) {
            this.n5((byte)-1);
         }

         if (this.l6() == 0 && var2.l6() != 1) {
            this.l6((byte)-1);
         }
      }
   }

   @Override
   public String toString() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      var1.l6("TextCFException");
      var1.n5(super.toString());
      return var1.toString();
   }

   public final u7f t4() {
      u7f var1 = new u7f();
      var1.l6(this);
      return var1;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public u7f cloneT() {
      return this.t4();
   }

}
