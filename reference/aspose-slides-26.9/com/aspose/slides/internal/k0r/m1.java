package com.aspose.slides.internal.k0r;

import com.aspose.slides.IGenericCloneable;

public class m1 implements IGenericCloneable<m1> {
   private com.aspose.slides.internal.o9b.c8 n5 = new com.aspose.slides.internal.o9b.c8();
   private long l6;

   public m1(long var1, com.aspose.slides.internal.o9b.c8 var3) {
      this.n5(var3.o8());
      this.n5(var1);
   }

   public m1(long var1) {
      this.n5(com.aspose.slides.internal.n8e.v4.n5(var1 & 4294967295L & 16777215L & 4294967295L).o8());
      this.n5((var1 & 4294967295L) >> 24 & 4294967295L);
   }

   public final com.aspose.slides.internal.o9b.c8 n5() {
      return this.n5;
   }

   public final void n5(com.aspose.slides.internal.o9b.c8 var1) {
      var1.n5(this.n5);
   }

   public final long l6() {
      return this.l6;
   }

   public final void n5(long var1) {
      this.l6 = var1;
   }

   public final long k5() {
      return ((this.l6() & 4294967295L & 4294967295L) << 24 | com.aspose.slides.internal.n8e.v4.n5(this.n5().o8())) & 4294967295L;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5(
         "ColorIndexStruct: Color: {0}, Index: {1}, Struct: 0x{2:X}",
         this.n5().toString(),
         com.aspose.slides.ms.System.d5.getName(com.aspose.slides.internal.v6g.k5.n5(m1$n5.class), Long.valueOf(this.l6())),
         this.k5()
      );
   }

   public final m1 u3() {
      return new m1(this.l6(), this.n5().o8());
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public m1 cloneT() {
      return this.u3();
   }

}
