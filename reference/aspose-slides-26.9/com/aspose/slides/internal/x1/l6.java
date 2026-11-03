package com.aspose.slides.internal.x1;

import com.aspose.slides.internal.z0k.t4;

public class l6 {
   private t4 n5 = null;
   private byte[] l6 = new byte[8];
   private byte[] k5 = new byte[16];
   private long u3 = 0L;
   private long a6 = 0L;
   private long u9 = 65534L;
   private long h0 = 0L;
   private long c8 = 0L;
   private long t2 = 0L;
   private long s7 = 0L;
   private long x8 = 0L;
   private long n3 = 0L;
   private long y4 = 0L;
   private long e2 = 0L;
   private long t9 = 0L;
   private static final byte[] z1 = new byte[]{-48, -49, 17, -32, -95, -79, 26, -31};

   public l6() {
   }

   public l6(t4 var1) {
      if (var1.getLength() < 76L) {
         throw new k5("Insufficient header length.");
      }

      this.n5 = var1;
      this.s7();
   }

   private void s7() {
      com.aspose.slides.internal.z0k.n5 var1 = new com.aspose.slides.internal.z0k.n5(this.n5);
      this.l6 = var1.c8(8);
      if ((this.l6[0] & 255) == 80 && (this.l6[1] & 255) == 75 && (this.l6[2] & 255) == 3 && (this.l6[3] & 255) == 4) {
         throw new u3("The file is ZIP archive. It can be Microsoft PowerPoint 2007 PPTX presentation.");
      }

      if ((this.l6[0] & 255) == (z1[0] & 255)
         && (this.l6[1] & 255) == (z1[1] & 255)
         && (this.l6[2] & 255) == (z1[2] & 255)
         && (this.l6[3] & 255) == (z1[3] & 255)
         && (this.l6[4] & 255) == (z1[4] & 255)
         && (this.l6[5] & 255) == (z1[5] & 255)
         && (this.l6[6] & 255) == (z1[6] & 255)
         && (this.l6[7] & 255) == (z1[7] & 255)) {
         this.k5 = var1.c8(16);
         this.u3 = var1.r4() & 65535;
         this.a6 = var1.r4() & 65535;
         if (this.a6 != 3L && this.a6 != 4L) {
            throw new u3("Invalid binary file format version: Only compound files with major version 3 or 4 are supported.");
         }

         this.u9 = var1.r4() & 65535;
         this.h0 = var1.r4() & 65535;
         this.c8 = var1.r4() & 65535;
         var1.c8(10);
         this.t2 = var1.c4() & 4294967295L;
         this.s7 = var1.c4() & 4294967295L;
         var1.c8(4);
         this.x8 = var1.c4() & 4294967295L;
         this.x8 = 4096L;
         this.n3 = var1.c4();
         this.y4 = var1.c4() & 4294967295L;
         this.e2 = var1.m3();
         this.t9 = var1.c4() & 4294967295L;
      } else {
         throw new u3("Unknown file format.");
      }
   }

   public final void n5(short var1) {
      this.u9 = var1;
   }

   public final int n5() {
      return 1 << (int)this.h0;
   }

   private int u3(short var1) {
      if (var1 == 0) {
         this.h0 = 0L;
         return 0;
      }

      int var2;
      for (var2 = 0; var1 != 1; var2++) {
         var1 = (short)(var1 >> 1);
      }

      return var2;
   }

   public final void l6(short var1) {
      this.h0 = this.u3(var1);
   }

   public final int l6() {
      return 1 << (int)this.c8;
   }

   public final void k5(short var1) {
      this.c8 = this.u3(var1);
   }

   public final long k5() {
      return this.t2;
   }

   public final void n5(int var1) {
      this.t2 = var1;
   }

   public final long u3() {
      return this.s7;
   }

   public final void n5(long var1) {
      this.s7 = var1 & 4294967295L;
   }

   public final long a6() {
      return this.x8;
   }

   public final void l6(int var1) {
      this.x8 = var1;
   }

   public final long u9() {
      return this.n3;
   }

   public final void l6(long var1) {
      this.n3 = var1;
   }

   public final long h0() {
      return this.y4;
   }

   public final void k5(int var1) {
      this.y4 = var1;
   }

   public final long c8() {
      return this.t9;
   }

   public final void u3(int var1) {
      this.t9 = var1;
   }

   public final long t2() {
      return this.e2;
   }

   public final void k5(long var1) {
      this.e2 = var1;
   }

   public final void n5(t4 var1) {
      com.aspose.slides.internal.z0k.l6 var2 = new com.aspose.slides.internal.z0k.l6(var1);
      var2.n5(new byte[]{-48, -49, 17, -32, -95, -79, 26, -31});
      var2.n5(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
      var2.n5((byte)62);
      var2.n5((byte)0);
      var2.n5((byte)3);
      var2.n5((byte)0);
      var2.n5((byte)(this.u9 & 255L));
      var2.n5((byte)(this.u9 >> 8 & 255L));
      var2.n5((byte)9);
      var2.n5((byte)0);
      var2.n5((byte)6);
      var2.n5((byte)0);
      var2.n5(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
      var2.l6((int)this.t2);
      var2.l6((int)this.s7);
      var2.n5(new byte[]{0, 0, 0, 0});
      var2.l6((int)this.x8);
      var2.n5(this.n3 & 4294967295L);
      var2.l6((int)this.y4);
      var2.l6((int)this.e2);
      var2.l6((int)this.t9);
      var2.k5();
   }
}
