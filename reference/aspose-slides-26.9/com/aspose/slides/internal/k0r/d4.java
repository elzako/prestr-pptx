package com.aspose.slides.internal.k0r;

public final class d4 extends v2 {
   private long n5;
   private String l6;
   private String k5;
   private long u3;
   private String a6;
   private String u9;

   @Override
   public com.aspose.slides.ms.System.o0 n5() {
      return e7.a6;
   }

   public final long l6() {
      return (this.l6 != null ? this.l6.length() : 0) + 1 & 4294967295L;
   }

   public final String a6() {
      return this.k5;
   }

   public final String u9() {
      return this.l6;
   }

   public final void n5(String var1) {
      this.l6 = var1;
   }

   public final String h0() {
      return this.a6;
   }

   public final void l6(String var1) {
      this.a6 = var1;
   }

   public final String c8() {
      return this.u9;
   }

   public final long t2() {
      return (this.a6 != null ? this.a6.length() : 0) + 1 & 4294967295L;
   }

   @Override
   public long k5() {
      return (
               (
                        ((4L + (this.l6() & 4294967295L) & 4294967295L) + ((this.k5 == null ? 0 : this.k5.length() * 2) & 4294967295L) & 4294967295L) + 4L
                           & 4294967295L
                     )
                     + (this.t2() & 4294967295L)
                  & 4294967295L
            )
            + ((this.u9 == null ? 0 : this.u9.length() * 2) & 4294967295L)
         & 4294967295L;
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.c4();
      this.l6 = com.aspose.slides.internal.n8e.v4.n5(var1);
      if ((this.n5 & 4294967295L) > this.l6.length() + 1) {
         long var2 = ((this.n5 & 4294967295L) - this.l6.length() & 4294967295L) / 2L & 4294967295L;
         byte[] var4 = var1.c8((int)var2);
         this.k5 = com.aspose.slides.internal.l7h.j5.z1().l6(var4);
      }

      this.u3 = var1.c4();
      this.a6 = com.aspose.slides.internal.n8e.v4.n5(var1);
      if ((this.u3 & 4294967295L) > this.a6.length() + 1) {
         long var5 = ((this.u3 & 4294967295L) - this.a6.length() & 4294967295L) / 2L & 4294967295L;
         byte[] var6 = var1.c8((int)var5);
         this.u9 = com.aspose.slides.internal.l7h.j5.z1().l6(var6);
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.l6());
      if ((this.l6() & 4294967295L) > 1L) {
         var1.n5(com.aspose.slides.internal.l7h.j5.u3(1252).u3(this.u9()));
      }

      var1.n5((byte)0);
      if (!com.aspose.slides.ms.System.d1.n5(this.a6())) {
         var1.n5(com.aspose.slides.internal.l7h.j5.z1().u3(this.a6()));
      }

      var1.n5(this.t2());
      if ((this.t2() & 4294967295L) > 1L) {
         var1.n5(com.aspose.slides.internal.l7h.j5.u3(1252).u3(this.h0()));
      }

      var1.n5((byte)0);
      if (!com.aspose.slides.ms.System.d1.n5(this.c8())) {
         var1.n5(com.aspose.slides.internal.l7h.j5.z1().u3(this.c8()));
      }
   }

   @Override
   public String u3() {
      return com.aspose.slides.ms.System.d1.n5("{0}{1}",new Object[]{ this.u9(), this.h0()});
   }
}
