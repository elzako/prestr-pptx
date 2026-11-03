package com.aspose.slides.internal.l6z;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;

public class n3 {
   private byte n5;
   private byte l6;
   private byte k5;
   private byte[] u3;
   private byte[] a6;
   private byte[] u9;
   private byte h0;
   private byte c8;
   private byte t2;
   private final byte[] s7;
   private com.aspose.slides.ms.System.o0 x8 = new com.aspose.slides.ms.System.o0();

   public n3(com.aspose.slides.ms.System.o0 var1, long var2, byte[] var4) {
      if (var4 == null) {
         throw new ArgumentNullException("data");
      }

      var1.k5(this.x8);
      this.s7 = var4;
      this.l6(var2);
   }

   @Override
   public String toString() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      var1.n5("{0:x2}", this.n5);
      var1.n5("{0:x2}", this.l6);
      var1.n5("{0:x2}", this.k5);

      for (byte var5 : this.u3) {
         var1.n5("{0:x2}", var5);
      }

      for (byte var12 : this.a6) {
         var1.n5("{0:x2}", var12);
      }

      for (byte var13 : this.u9) {
         var1.n5("{0:x2}", var13);
      }

      return com.aspose.slides.ms.System.d1.t2(var1.toString());
   }

   private void n5(byte var1) {
      this.h0 = var1;
      this.c8 = this.k5;
      this.t2 = this.l6;
   }

   private byte n5() {
      byte var1 = 0;
      String var2 = com.aspose.slides.ms.System.d1.t2(this.x8.n5("B"));

      for (int var3 = 0; var3 < var2.length(); var3++) {
         char var4 = var2.charAt(var3);
         var1 = (byte)((var1 & 255) + ((byte)(var4 & 0xFF) & 255));
      }

      return var1;
   }

   private static byte l6() {
      return (byte)(com.aspose.slides.ms.System.p3.n5(com.aspose.slides.ms.System.j5.s7().n3()) & 0xFF);
   }

   private void k5() {
      byte var1 = (byte)((this.n5 & 255 & 6) / 2);
      List var2 = new List(var1 & 255);
      com.aspose.slides.ms.System.i9 var3 = new com.aspose.slides.ms.System.i9(this.n5 & 255);

      for (int var4 = 1; var4 <= (var1 & 255); var4++) {
         byte var5 = (byte)(var3.n5(0, 255) & 0xFF);
         byte var6 = (byte)(var5 & 0xFF ^ (this.t2 & 255) + (this.h0 & 255));
         var2.addItem(var6);
         this.t2 = this.c8;
         this.c8 = var6;
         this.h0 = var5;
      }

      this.u3 = com.aspose.slides.internal.n8e.v4.l6(var2);
   }

   private void n5(long var1) {
      byte[] var3 = new byte[]{
         (byte)var1,
         (byte)((var1 & 4294967295L) >> 8 & 4294967295L & 255L & 4294967295L),
         (byte)((var1 & 4294967295L) >> 16 & 4294967295L & 255L & 4294967295L),
         (byte)((var1 & 4294967295L) >> 24 & 4294967295L & 255L & 4294967295L)
      };
      List var4 = new List(4);

      for (byte var8 : var3) {
         byte var9 = (byte)(var8 & 0xFF ^ (this.t2 & 255) + (this.h0 & 255));
         var4.addItem(var9);
         this.t2 = this.c8;
         this.c8 = var9;
         this.h0 = var8;
      }

      this.a6 = com.aspose.slides.internal.n8e.v4.l6(var4);
   }

   private void u3() {
      List var1 = new List(4);

      for (byte var5 : this.s7) {
         byte var6 = (byte)(var5 & 0xFF ^ (this.t2 & 255) + (this.h0 & 255));
         var1.addItem(var6);
         this.t2 = this.c8;
         this.c8 = var6;
         this.h0 = var5;
      }

      this.u9 = com.aspose.slides.internal.n8e.v4.l6(var1);
   }

   private void l6(long var1) {
      byte var3 = this.n5();
      this.n5 = l6();
      this.l6 = (byte)(this.n5 & 0xFF ^ 2);
      this.k5 = (byte)(this.n5 & 0xFF ^ var3 & 0xFF);
      this.n5(var3);
      this.k5();
      this.n5(var1);
      this.u3();
   }
}
