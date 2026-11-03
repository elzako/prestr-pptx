package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.ms.System.IDisposable;

final class g6o extends j1 {
   private g6c l6;
   private ISaveOptions k5;
   private long u3 = 0L;
   private long a6 = 0L;
   private long u9 = 1L;
   private long h0 = 0L;
   private int c8 = 0;
   private com.aspose.slides.internal.k0r.b7 t2;
   private com.aspose.slides.internal.k0r.c4 s7;
   private final Dictionary<BaseSlide, y2q> x8 = new Dictionary<>();
   private final Dictionary<ILayoutSlide, Long> n3 = new Dictionary<>();
   private Dictionary<com.aspose.slides.internal.k0r.d6, ISlide> y4 = new Dictionary<>();
   private y2q e2 = null;
   private y2q t9 = null;
   private List<y2q> z1 = new List<>();
   private List<y2q> t4 = new List<>();
   private List<y2q> q0 = new List<>();
   private long[] z3;
   private com.aspose.slides.internal.k0r.o6t[] m1 = null;
   private boolean k7 = false;
   private int m3 = 0;
   private final Dictionary<Long, k1z> z8 = new Dictionary<>();
   private IThemeEffectiveData j5;
   private int w1 = 0;
   private IGenericList<IFontData> r4;
   private byte[] c4;
   int[] n5;
   private final Dictionary<Long, Integer> y2 = new Dictionary<>();
   private static final byte[] y1 = new byte[]{
      0,
      2,
      15,
      16,
      0,
      2,
      13,
      14,
      1,
      21,
      1,
      2,
      7,
      9,
      8,
      1,
      2,
      13,
      19,
      1,
      2,
      13,
      14,
      1,
      2,
      13,
      21,
      1,
      2,
      13,
      23,
      1,
      2,
      13,
      20,
      1,
      2,
      13,
      18,
      2,
      21,
      3,
      4,
      7,
      9,
      8,
      2,
      18,
      3,
      4,
      7,
      1,
      13,
      8,
      3,
      13,
      14,
      14,
      8,
      3,
      13,
      14,
      20,
      8,
      3,
      13,
      20,
      14,
      8,
      3,
      13,
      14,
      22,
      8,
      3,
      13,
      22,
      14,
      8,
      3,
      13,
      14,
      19,
      8,
      3,
      13,
      19,
      14,
      8,
      3,
      13,
      14,
      24,
      8,
      3,
      13,
      24,
      14,
      8,
      3,
      13,
      22,
      18,
      8,
      3,
      13,
      19,
      19,
      9,
      3,
      13,
      14,
      19,
      9,
      3,
      13,
      19,
      14,
      10,
      4,
      13,
      14,
      19,
      19,
      10,
      4,
      13,
      19,
      19,
      19,
      11,
      4,
      13,
      19,
      19,
      19,
      11,
      4,
      13,
      19,
      19,
      14,
      13,
      4,
      13,
      19,
      19,
      14,
      14,
      5,
      13,
      19,
      19,
      19,
      19,
      15,
      1,
      19,
      16,
      2,
      13,
      14,
      16,
      5,
      13,
      14,
      19,
      14,
      19,
      16,
      3,
      13,
      19,
      14,
      17,
      2,
      17,
      18,
      18,
      3,
      17,
      18,
      20
   };

   g6o(com.aspose.slides.internal.k0r.e3 var1, Presentation var2, int[] var3, InterruptionToken var4) {
      super(var1, var2, var4);
      if (this.n5() == null) {
         throw new ArgumentNullException();
      }

      com.aspose.slides.internal.c8m.d9 var5 = new com.aspose.slides.internal.c8m.d9();
      this.l6 = new g6c(var5, this.n5(), var3, new PptxOptions(), var4);
      this.l6.n5(true);
      this.z3 = a3();
      this.n5 = var3;
   }

   private static long[] a3() {
      List var0 = new List();
      int var1 = y1.length;
      int var2 = 0;
      int var3 = 0;

      while (var2 < var1) {
         long var4 = (y1[var2 + 1] & 0xFF & 16 & 4294967295L) << 27 & 4294967295L;
         int var6 = y1[var2 + 1] & 255 & 15;

         for (int var7 = 0; var7 < var6; var7++) {
            var4 = (var4 | n5(y1[var2 + 2 + var7] & 255)) & 4294967295L;
         }

         var0.addItem(var4);
         var0.addItem((y1[var2] & 255) + (var3 << 16) & 4294967295L);
         var3++;
         var2 += 2 + var6;
      }

      return com.aspose.slides.internal.n8e.v4.u9(var0);
   }

   private static long n5(int var0) {
      if (var0 == 0) {
         return 0L;
      }

      int var1 = ((byte)var0 & 255) - 1;
      return var1 > 0 ? 1 << var1 & 4294967295L : 1L;
   }

   private long l6(com.aspose.slides.internal.k0r.h3d var1) {
      long var2 = 0L;

      for (int var4 = 0; var4 < 8; var4++) {
         var2 = (var2 | n5(var1.c8()[var4])) & 4294967295L;
      }

      return var2;
   }

   private void n5(com.aspose.slides.internal.k0r.h3d var1, int var2) {
      int var3 = y1[var2 + 1] & 255 & 15;

      for (int var4 = 0; var4 < var3; var4++) {
         var1.c8()[var4] = y1[var2 + 2 + var4] & 255;
      }
   }

   final boolean n5(com.aspose.slides.internal.k0r.h3d var1) {
      for (int var2 = 0; var2 < 8; var2++) {
         if (var1.c8()[var2] != 0) {
            return true;
         }
      }

      return false;
   }

   final void n5(com.aspose.slides.internal.k0r.h3d var1, boolean var2) {
      boolean var3 = this.n5(var1);
      if (var3 || var1.h0() != 16) {
         if (!var3) {
            int var4 = y1.length;

            int var5;
            for (var5 = 0; var5 < var4; var5 += 2 + (y1[var5 + 1] & 255) & 15) {
               if ((y1[var5] & 255) == var1.h0() && var2 == ((y1[var5 + 1] & 255 & 16) != 0)) {
                  this.n5(var1, var5);
                  break;
               }
            }

            if (var5 >= var4) {
               throw new NotImplementedException("Have no matched Geom type for SlideAtom!");
            }
         } else {
            long var6 = (this.l6(var1) | (var2 ? 2147483648L : 0L)) & 4294967295L;
            int var19 = this.z3.length >> 1;
            List var8 = new List();
            long var9 = 32L;

            for (int var11 = 0; var11 < var19; var11++) {
               long var12 = this.z3[var11 * 2];
               if (((var12 ^ 4294967295L) & var6 & 4294967295L) == 0L) {
                  long var14 = com.aspose.slides.internal.n8e.v4.k5((var6 ^ var12) & 4294967295L);
                  if ((var9 & 4294967295L) > (var14 & 4294967295L)) {
                     var8 = new List();
                     var9 = var14;
                  }

                  if ((var14 & 4294967295L) <= (var9 & 4294967295L)) {
                     var8.addItem(this.z3[var11 * 2 + 1]);
                  }
               }
            }

            long var16 = 65535L;
            if (var8.size() == 1) {
               var16 = ((Long)var8.get_Item(0) & 4294967295L) >> 16 & 4294967295L & 65535L & 4294967295L;
               var1.n5((int)((Long)var8.get_Item(0) & 4294967295L & 65535L));
            }

            if (var8.size() > 1) {
               for (int var18 = 0; var18 < var8.size(); var18++) {
                  if (((Long)var8.get_Item(var18) & 4294967295L & 65535L & 4294967295L) == (var1.h0() & 4294967295L)) {
                     var16 = ((Long)var8.get_Item(var18) & 4294967295L) >> 16 & 4294967295L & 65535L & 4294967295L;
                     break;
                  }
               }

               if ((var16 & 4294967295L) == 65535L) {
                  var1.n5(16);

                  for (int var21 = 0; var21 < 8; var21++) {
                     var1.c8()[var21] = 0;
                  }

                  return;
               }
            }

            if ((var16 & 4294967295L) < 65535L) {
               int var20 = 0;

               while ((var16 & 4294967295L) > 0L) {
                  var20 += 2 + (y1[var20 + 1] & 255) & 15;
                  var16--;
               }

               this.n5(var1, var20);
            }
         }
      }
   }

   public final g6c t9() {
      return this.l6;
   }

   public final Dictionary<BaseSlide, y2q> z1() {
      return this.x8;
   }

   public final Dictionary<ILayoutSlide, Long> t4() {
      return this.n3;
   }

   public final ISaveOptions q0() {
      return this.k5;
   }

   public final void n5(ISaveOptions var1) {
      this.k5 = var1;
   }

   public final com.aspose.slides.internal.k0r.o6t[] z3() {
      return this.m1;
   }

   public final void n5(com.aspose.slides.internal.k0r.o6t[] var1) {
      this.m1 = var1;
   }

   public final com.aspose.slides.internal.k0r.b7 m1() {
      return this.t2;
   }

   public final void n5(com.aspose.slides.internal.k0r.b7 var1) {
      this.t2 = var1;
   }

   public final com.aspose.slides.internal.k0r.y7 k7() {
      return this.h0().x8().l6();
   }

   public final Dictionary<com.aspose.slides.internal.k0r.d6, ISlide> m3() {
      return this.y4;
   }

   public final boolean z8() {
      return this.k7;
   }

   public final void n5(boolean var1) {
      this.k7 = var1;
   }

   public final int j5() {
      return ++this.m3;
   }

   public final int w1() {
      return ++this.c8;
   }

   public final Dictionary<Long, k1z> r4() {
      return this.z8;
   }

   public final Dictionary<Long, Integer> c4() {
      return this.y2;
   }

   public final com.aspose.slides.internal.k0r.c4 y2() {
      return this.s7;
   }

   public final void n5(com.aspose.slides.internal.k0r.c4 var1) {
      this.s7 = var1;
   }

   public final com.aspose.slides.internal.k0r.x6 n5(long var1) {
      com.aspose.slides.internal.k0r.x6 var3 = null;
      List$Enumerator var4 = this.k7().l6().u3().iterator();

      try {
         while (var4.hasNext()) {
            com.aspose.slides.internal.k0r.x6 var5 = (com.aspose.slides.internal.k0r.x6)var4.next();
            if (var5.n5() == var1) {
               var3 = var5;
               break;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (var3 == null) {
         throw new ArgumentException("There is no OfficeArtIDCL record for specified drawing ID.");
      } else {
         return var3;
      }
   }

   final long l6(boolean var1) {
      long var2 = (this.u9 & 4294967295L) + (this.h0 & 4294967295L) & 4294967295L;
      this.u9++;
      if (var1) {
         this.m1().n5(this.m1().k5() + 1L);
         this.k7().l6().l6(this.k7().l6().l6() + 1L);
      }

      this.m1().l6(var2);
      this.k7().l6().n5((var2 & 4294967295L) + 1L & 4294967295L);
      this.n5((long)(this.m1().l6() & 65535)).l6(this.u9);
      return var2;
   }

   final void y1() {
      long var1 = (this.h0 & 4294967295L) + (this.u9 & 4294967295L) & 4294967295L;
      this.u9 = 0L;

      do {
         this.h0 = (this.h0 & 4294967295L) + 1024L & 4294967295L;
      } while ((this.h0 & 4294967295L) <= (var1 & 4294967295L));
   }

   final long a0() {
      long var1 = (this.k7().l6().u3().size() & 4294967295L) + 1L & 4294967295L;
      this.k7().l6().k5(this.k7().l6().k5() + 1L);
      com.aspose.slides.internal.k0r.x6 var3 = new com.aspose.slides.internal.k0r.x6(var1, 0L);
      this.k7().l6().u3().addItem(var3);
      return var1;
   }

   final long d2() {
      return ++this.a6;
   }

   final int d5() {
      return 1;
   }

   final void n5(String var1, int var2) {
      if (this.q0() != null && this.q0().getWarningCallback() != null) {
         com.aspose.slides.internal.n8e.u6 var3 = new com.aspose.slides.internal.n8e.u6(var1, var2);
         var3.sendWarning(this.q0().getWarningCallback());
      }
   }

   final void n5(BaseSlide var1) {
      this.j5 = var1.createThemeEffective();
   }

   final IFontData n5(IFontData var1, String var2) {
      if (this.j5 == null) {
         return var1;
      }

      if (var1 == null) {
         return null;
      }

      FontData var3 = null;
      if (!com.aspose.slides.ms.System.d1.n5(var2) && com.aspose.slides.ms.System.d1.l6(var1.getFontName(), "+")) {
         String var4 = null;
         if (com.aspose.slides.ms.System.d1.l6(var1.getFontName(), "+mn")) {
            var4 = ((c5z)this.j5.getFontScheme().getMinor()).n5(var2);
         }

         if (com.aspose.slides.ms.System.d1.l6(var1.getFontName(), "+mj")) {
            var4 = ((c5z)this.j5.getFontScheme().getMajor()).n5(var2);
         }

         if (var4 != null) {
            var3 = new FontData(var4);
         }
      }

      if (var3 == null) {
         var3 = ((FontData)var1).n5(this.j5);
      }

      return var3 == null ? var1 : var3;
   }

   final int s3() {
      this.w1++;
      return this.w1;
   }

   final boolean p8() {
      return this.p3() == null ? false : this.p3().t4().c8().n5() && this.p3().getHeaderFooterManager().isDateTimeVisible();
   }

   final boolean f2() {
      return this.p3() != null ? this.p3().z3().l6() : false;
   }

   final String i1() {
      return this.p3() != null ? this.p3().z3().k5() : com.aspose.slides.ms.System.d1.n5;
   }

   final boolean e5() {
      return this.p3() == null ? false : this.p3().t4().c8().l6() && this.p3().getHeaderFooterManager().isFooterVisible();
   }

   final String b3() {
      if (this.p3() != null) {
         AutoShape var1 = com.aspose.slides.internal.v6g.k5.n5(this.p3().n5((byte)6), AutoShape.class);
         if (var1 != null && var1.getTextFrame() != null) {
            IGenericEnumerator var2 = var1.getTextFrame().getParagraphs().iterator();

            try {
               while (var2.hasNext()) {
                  IParagraph var3 = (IParagraph)var2.next();
                  IGenericEnumerator var4 = var3.getPortions().iterator();

                  try {
                     while (var4.hasNext()) {
                        IPortion var5 = (IPortion)var4.next();
                        if (var5.getField() != null && var5.getField().getType() == FieldType.getFooter()) {
                           String var6 = var5.getText();
                           if (var6 == null) {
                              var6 = com.aspose.slides.ms.System.d1.n5;
                           }

                           return var6;
                        }
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
                        var4.dispose();
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
                  var2.dispose();
               }
            }
         }
      }

      return com.aspose.slides.ms.System.d1.n5;
   }

   final boolean o0() {
      return this.p3() == null ? false : this.p3().t4().c8().u3() && this.p3().getHeaderFooterManager().isSlideNumberVisible();
   }

   private MasterSlide p3() {
      return this.u6().size() > 0 && com.aspose.slides.internal.v6g.k5.l6(this.u6().get_Item(0).l6(), MasterSlide.class)
         ? (MasterSlide)this.u6().get_Item(0).l6()
         : null;
   }

   final void n5(y2q var1) {
      this.z1().addItem(var1.l6(), var1);
      switch (var1.k5()) {
         case 0:
            this.u6().addItem(var1);
         case 1:
         case 2:
         case 3:
         default:
            break;
         case 4:
            this.t1().addItem(var1);
            break;
         case 5:
            this.e2 = var1;
            break;
         case 6:
            this.a5().addItem(var1);
            break;
         case 7:
            this.t9 = var1;
      }
   }

   final y2q z7() {
      return this.e2;
   }

   final y2q v4() {
      return this.t9;
   }

   final List<y2q> u6() {
      return this.z1;
   }

   final List<y2q> t1() {
      return this.t4;
   }

   final List<y2q> a5() {
      return this.q0;
   }

   final boolean h2() {
      return true;
   }

   final IGenericList<IFontData> v0() {
      v6v var1 = this.n5().z1().n5();
      int var2 = var1.a6();
      if (this.r4 == null) {
         this.r4 = var1.u3();
      } else if (var2 != this.r4.size()) {
         this.r4 = var1.u3();
      }

      return this.r4;
   }

   final byte[] f0() {
      return this.c4;
   }

   final void n5(byte[] var1) {
      this.c4 = var1;
   }
}
