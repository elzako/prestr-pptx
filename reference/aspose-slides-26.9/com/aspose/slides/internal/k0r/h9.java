package com.aspose.slides.internal.k0r;

import com.aspose.slides.PptException;

public class h9 extends e6r implements m4 {
   private long n5;
   private byte[] l6;
   private long k5;

   public h9() {
      this.w1().n5(4113);
      this.w1().n5((short)1);
   }

   public final boolean l6() {
      return this.w1().k5() == 1;
   }

   public final byte[] k5() {
      try {
         return com.aspose.slides.internal.j7.t9.n5(this.l6, (int)this.k5, 1);
      } catch (com.aspose.slides.internal.e5a.f2 var2) {
         com.aspose.slides.internal.n8e.v4.n5(var2);
         return com.aspose.slides.internal.j7.t9.n5(this.l6, (int)this.k5, 0);
      }
   }

   public final void n5(byte[] var1) {
      this.l6 = null;
      this.k5 = 0L;
      if (var1 != null) {
         this.l6 = com.aspose.slides.internal.j7.t9.n5(var1, 1);
         this.k5 = var1.length & 4294967295L;
      }

      this.w1().l6(this.n5());
   }

   @Override
   public final long c8() {
      return this.n5;
   }

   @Override
   public final void n5(long var1) {
      this.n5 = var1;
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      if (this.l6()) {
         this.k5 = var1.c4();
         this.l6 = var1.c8(this.w1().a6() - 4);
      } else {
         this.n5(var1.c8(this.w1().a6()));
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      if (this.l6 == null) {
         String var2 = "Serialization of external storage with empty data. View [ms-ppt] 2.10.34 ExOleObjStg, 2.10.37 ExControlStg, 2.10.40 VbaProjectStg.";
         throw new PptException(var2);
      }

      if (this.l6()) {
         var1.n5(this.k5);
         var1.n5(this.l6);
      } else {
         var1.n5(this.k5());
      }
   }

   @Override
   public int n5() {
      if (this.l6()) {
         long var1 = this.l6 != null ? this.l6.length & 4294967295L : 0L;
         return (int)var1 + 4;
      } else {
         return this.k5().length;
      }
   }
}
