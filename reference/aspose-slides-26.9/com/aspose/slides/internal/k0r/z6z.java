package com.aspose.slides.internal.k0r;

public class z6z {
   private byte n5;
   private short l6;
   private int k5;
   private int u3;
   private long a6;

   z6z() {
   }

   public z6z(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5(var1);
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5(
         "RecordHeader, Type:0x{0:X} [{1}], Version:{2}, Instance:{3}, Length:0x{4:X}",
         this.k5,
         com.aspose.slides.ms.System.d5.getName(com.aspose.slides.internal.v6g.k5.n5(n4.class), this.k5),
         this.n5,
         this.l6,
         this.u3
      );
   }

   final void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.a6 = var1.x8().getPosition();
      int var2 = var1.m3();
      this.n5 = (byte)(var2 & 15);
      this.l6 = (short)((var2 & 65520) >> 4);
      this.k5 = (int)((var2 & 4294901760L & 4294967295L) >> 16);
      this.u3 = (int)var1.c4();
   }

   final void n5(com.aspose.slides.internal.z0k.l6 var1) {
      int var2 = 0;
      var2 |= this.n5 & 255;
      var2 |= this.l6 << 4;
      var2 |= (this.k5 & 65535) << 16;
      var1.l6(var2);
      var1.l6(this.u3);
   }

   public final boolean n5() {
      return (this.n5 & 255) == 15;
   }

   public final byte l6() {
      return this.n5;
   }

   public final void n5(byte var1) {
      this.n5 = var1;
   }

   public final short k5() {
      return this.l6;
   }

   public final void n5(short var1) {
      this.l6 = var1;
   }

   public final int u3() {
      return com.aspose.slides.internal.n8e.v4.n5(this.k5);
   }

   public final void n5(int var1) {
      this.k5 = var1;
   }

   public final int a6() {
      return this.u3;
   }

   public final void l6(int var1) {
      this.u3 = var1;
   }

   public final long u9() {
      return this.a6;
   }
}
