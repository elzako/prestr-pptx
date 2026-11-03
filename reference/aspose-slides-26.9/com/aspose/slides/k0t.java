package com.aspose.slides;

final class k0t {
   private final FillFormat n5;
   private final LineFormat l6;
   private final LineFormat k5;
   private final LineFormat u3;
   private final LineFormat a6;
   private final LineFormat u9;
   private final LineFormat h0;
   private final r0g c8;

   k0t(r0g var1, FillFormat var2, LineFormat var3, LineFormat var4, LineFormat var5, LineFormat var6, LineFormat var7, LineFormat var8) {
      this.c8 = var1;
      this.n5 = var2;
      this.l6 = var3;
      this.k5 = var4;
      this.u3 = var5;
      this.a6 = var6;
      this.u9 = var7;
      this.h0 = var8;
   }

   final long n5() {
      Cell var1 = (Cell)this.c8;
      return (
               (
                        (
                                 (
                                          (
                                                   ((var1.k5().x8().getVersion() & 4294967295L) + (this.n5.getVersion() & 4294967295L) & 4294967295L)
                                                         + (this.l6.getVersion() & 4294967295L)
                                                      & 4294967295L
                                                )
                                                + (this.k5.getVersion() & 4294967295L)
                                             & 4294967295L
                                       )
                                       + (this.u3.getVersion() & 4294967295L)
                                    & 4294967295L
                              )
                              + (this.a6.getVersion() & 4294967295L)
                           & 4294967295L
                     )
                     + (this.u9.getVersion() & 4294967295L)
                  & 4294967295L
            )
            + (this.h0.getVersion() & 4294967295L)
         & 4294967295L;
   }
}
