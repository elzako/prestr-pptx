package com.aspose.slides.internal.b7s;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.r1x.i9;
import com.aspose.slides.internal.r1x.j3;
import com.aspose.slides.internal.r1x.j4;
import com.aspose.slides.internal.r1x.v3;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class q0 extends com.aspose.slides.internal.r1x.v0 {
   private int y4;
   private com.aspose.slides.internal.g7e.n5 e2;
   private int t9;
   private boolean z1;
   private com.aspose.slides.internal.l0u.n5 t4;
   private com.aspose.slides.internal.l0u.n5 q0;
   private List<com.aspose.slides.internal.r1x.m3> z3 = new List<>();

   public q0(int var1, int var2) {
      this(new com.aspose.slides.internal.g7e.n5(), var1, var2);
   }

   public q0(com.aspose.slides.internal.g7e.n5 var1, int var2, int var3) {
      this.e2 = var1;
      this.t9 = var2;
      this.y4 = var3;
   }

   private q0(int var1, int var2, int var3, com.aspose.slides.internal.b8u.q0 var4) {
      this.n5(var4, var1, var2);
      switch (var3) {
         case 0:
            this.e2.l6(0);
            break;
         case 1:
            this.e2.l6(4);
            break;
         case 2:
         default:
            throw new ArgumentOutOfRangeException("pixelFormat");
         case 3:
            this.e2.l6(1);
            break;
         case 4:
            this.e2.l6(2);
            break;
         case 5:
            this.e2.l6(3);
      }
   }

   public final com.aspose.slides.internal.g7e.n5 e5() {
      return this.e2;
   }

   public final String b3() {
      synchronized (this.t2) {
         return this.e2.y4();
      }
   }

   public final void n5(String var1) {
      synchronized (this.t2) {
         this.e2.n5(var1);
      }
   }

   public final com.aspose.slides.internal.d0c.l6 o0() {
      synchronized (this.t2) {
         return this.e2.e2();
      }
   }

   public final void n5(com.aspose.slides.internal.d0c.l6 var1) {
      synchronized (this.t2) {
         if (this.e2 != null && this.e2.e2() != null && this.e2.e2().a6() != null) {
            this.z3.addItem(this.e2.e2().a6());
         }

         if (this.e2 != null) {
            this.e2.n5(var1);
         }
      }
   }

   @Override
   public com.aspose.slides.internal.t6q.s7 w1() {
      synchronized (this.t2) {
         return this.e2.n5();
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.t6q.s7 var1) {
      synchronized (this.t2) {
         this.e2.n5(var1);
      }
   }

   @Override
   public int y4() {
      return this.y4;
   }

   public final t2 z7() {
      synchronized (this.t2) {
         return this.e2.n3();
      }
   }

   public final void n5(t2 var1) {
      synchronized (this.t2) {
         if (this.e2 != null && this.e2.n3() != null && this.e2.n3().l6() != null) {
            this.z3.addItem(this.e2.n3().l6());
         }

         if (this.e2 != null) {
            this.e2.n5(var1);
         }
      }
   }

   @Override
   public com.aspose.slides.internal.r1x.v4 y1() {
      synchronized (this.t2) {
         return l6(this.e2.z1(), this.e2.t4() & 255);
      }
   }

   @Override
   public int z1() {
      return this.t9;
   }

   public final com.aspose.slides.internal.l0u.n5 v4() {
      synchronized (this.t2) {
         return this.t4;
      }
   }

   public final void n5(com.aspose.slides.internal.l0u.n5 var1) {
      synchronized (this.t2) {
         this.t4 = var1;
      }
   }

   public final com.aspose.slides.internal.l0u.n5 u6() {
      synchronized (this.t2) {
         return this.q0;
      }
   }

   public final void l6(com.aspose.slides.internal.l0u.n5 var1) {
      synchronized (this.t2) {
         this.q0 = var1;
      }
   }

   public final boolean t1() {
      return this.z1;
   }

   public final void u3(boolean var1) {
      this.z1 = var1;
   }

   @Override
   protected boolean n5(int var1) {
      return var1 != 2 && var1 != 1 ? super.n5(var1) : true;
   }

   @Override
   protected void a6() {
      if (this.o0() != null && this.o0().a6() != null) {
         this.z3.addItem(this.o0().a6());
         this.o0().n5((com.aspose.slides.internal.r1x.f0)null);
      }

      if (this.z7() != null && this.z7().l6() != null) {
         this.z3.addItem(this.z7().l6());
         this.z7().n5((com.aspose.slides.internal.r1x.f0)null);
      }

      List$Enumerator var1 = this.z3.iterator();

      try {
         while (var1.hasNext()) {
            com.aspose.slides.internal.r1x.m3 var2 = (com.aspose.slides.internal.r1x.m3)var1.next();
            IDisposable var3 = com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class);
            if (var3 != null) {
               var3.dispose();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      super.a6();
   }

   @Override
   protected void i1() {
      if (this.j5()) {
         try {
            com.aspose.slides.internal.d0c.l6 var1 = this.o0();
            if (var1 == null) {
               var1 = new com.aspose.slides.internal.d0c.l6();
            }

            com.aspose.slides.internal.d0c.l6 var2 = var1;
            com.aspose.slides.ms.System.j5 var3 = com.aspose.slides.ms.System.j5.t2().m3();
            String var4 = d1.n5("{0:D4}:{1:D2}:{2:D2} {3:D2}:{4:D2}:{5:D2}",new Object[]{ var3.e2(), var3.c8(), var3.l6(), var3.u3(), var3.h0(), var3.x8()});
            var2.n5(var4);
            this.n5(var2);
         } catch (RuntimeException var5) {
            com.aspose.slides.internal.f8y.n5.u3(d1.n5(new String[]{"Exception on WaveletMap.Duplicate: ", var5.toString()}));
         }
      }

      super.i1();
   }

   static byte[] l6(com.aspose.slides.internal.d0c.l6 var0) {
      byte[] var1 = var0.c8();
      if (var1.length > 65528) {
         throw new com.aspose.slides.internal.h6t.n5(
            "Exif segment is excessively big to be stored in jpeg file. Consider JpegExifData.SerializeExifData() method for result data size estimation."
         );
      }

      v3 var2 = new v3(new com.aspose.slides.internal.z0k.e2(), true);

      byte[] var6;
      try {
         com.aspose.slides.internal.v6s.l6 var3 = new com.aspose.slides.internal.v6s.l6(var2);
         byte[] var4 = new byte[]{-1, -31};
         var3.n5(var4);
         var3.l6(var1.length + 8 & 65535);
         byte[] var5 = new byte[]{69, 120, 105, 102, 0, 0};
         var3.n5(var5);
         var3.n5(var1);
         var6 = var2.h0();
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }

      return var6;
   }

   static byte[] l6(com.aspose.slides.internal.t6q.s7 var0) {
      if (var0 == null) {
         throw new ArgumentNullException("xmpData");
      }

      String var1 = var0.u9();
      byte[] var2 = com.aspose.slides.internal.l7h.j5.z3().u3(var1);
      int var3 = "http://ns.adobe.com/xap/1.0/".length() + 1;
      int var4 = var2.length + 2 + var3;
      int var5 = 65533 - var3;
      if (var4 > var5) {
         throw new com.aspose.slides.internal.h6t.n5(d1.n5("XMP could not be grater than {0} bytes", new Object[]{var5}));
      }

      int var6 = var4 & 65535;
      String var7 = d1.n5(new Object[]{"http://ns.adobe.com/xap/1.0/", '\u0000'});
      byte[] var8 = com.aspose.slides.internal.l7h.j5.z3().u3(var7);
      v3 var9 = new v3(new com.aspose.slides.internal.z0k.e2(), true);

      byte[] var12;
      try {
         com.aspose.slides.internal.v6s.l6 var10 = new com.aspose.slides.internal.v6s.l6(var9);
         byte[] var11 = new byte[]{-1, -31};
         var10.n5(var11);
         var10.l6(var6 & 65535);
         var10.n5(var8);
         var10.n5(var2);
         var12 = var9.h0();
      } finally {
         if (var9 != null) {
            var9.dispose();
         }
      }

      return var12;
   }

   static void n5(
      com.aspose.slides.internal.r1x.f0 var0,
      com.aspose.slides.internal.z0k.t4 var1,
      t2 var2,
      com.aspose.slides.internal.d0c.l6 var3,
      com.aspose.slides.internal.t6q.s7 var4,
      com.aspose.slides.internal.g7e.n5 var5,
      com.aspose.slides.internal.o9b.y2 var6
   ) {
      y0 var7 = new y0(var1);
      k5(var7);
      if (var5.u3() != null) {
         if (var3 != null) {
            var3.n5(new com.aspose.slides.internal.u2w.c8(com.aspose.slides.internal.v6g.k5.a6(var5.u3().n5(), 14), 1L));
            var3.l6(new com.aspose.slides.internal.u2w.c8(com.aspose.slides.internal.v6g.k5.a6(var5.u3().l6(), 14), 1L));
            var3.n5(2);
         } else {
            if (var2 == null) {
               var2 = new t2();
            }

            var2.l6(com.aspose.slides.internal.v6g.k5.l6(var5.u3().n5(), 14));
            var2.k5(com.aspose.slides.internal.v6g.k5.l6(var5.u3().l6(), 14));
         }
      }

      if (var2 != null) {
         com.aspose.slides.internal.b7s.t2.n5(var2, var7);
      }

      n5(var7, var3);
      n5(var7, var4);
      if (var5 != null && !d1.n5(var5.y4())) {
         n5(var7, var5.y4());
      }

      if (var5.z1() == 2) {
      }

      if (var5.z1() == 3) {
         com.aspose.slides.internal.z0k.t4 var8 = var5.k7() != null ? var5.k7().n5() : com.aspose.slides.internal.r1x.k7.n5().n5();
         j4 var9 = i9.n5().n5(var8);

         try {
            synchronized (var9.n5()) {
               if (var5.k7() != null) {
                  var8 = var5.k7().n5();
               } else {
                  q0 var11 = com.aspose.slides.internal.v6g.k5.n5(var0, q0.class);
                  var8 = var11 != null && var11.u6() != null ? var11.u6().n5() : com.aspose.slides.internal.r1x.k7.n5().n5();
               }

               com.aspose.slides.internal.b7s.c8.n5(var8, var1);
               n5 var20 = new n5();
               var20.k5(100);
               var20.n5(0);
               var20.l6(0);
               var20.n5((byte)2);
               com.aspose.slides.internal.b7s.n5.n5(var1, var20);
               var5.l6(new com.aspose.slides.internal.l0u.n5(var8));
               if (var5.m1() == null) {
                  var5.n5(com.aspose.slides.internal.r1x.k7.l6());
               }
            }
         } finally {
            i9.n5().n5(var9);
         }
      } else if (var5.z1() == 4) {
         n5 var19 = new n5();
         var19.k5(100);
         var19.n5(0);
         var19.l6(0);
         var19.n5((byte)0);
         com.aspose.slides.internal.b7s.n5.n5(var1, var19);
      }

      switch (var5.t9()) {
         case 0:
         case 1:
            n5(var0, var5, var7, var6.n3());
            break;
         case 2:
            l6(var0, var5, var7, var6.n3());
            break;
         case 3:
            k5(var0, var5, var7, var6.n3());
            break;
         default:
            throw new ArgumentException();
      }

      n5(var7);
   }

   public static void n5(com.aspose.slides.internal.r1x.f0 var0, com.aspose.slides.internal.g7e.n5 var1, y0 var2, com.aspose.slides.internal.o9b.y2 var3) {
      com.aspose.slides.internal.r1x.z6 var4 = new com.aspose.slides.internal.r1x.z6();
      com.aspose.slides.internal.r1x.v4 var5 = l6(var1.z1(), var1.t4() & 255);
      com.aspose.slides.internal.o9b.y2 var6 = new com.aspose.slides.internal.o9b.y2(0, 0, var3.t2(), var3.l6());
      List var7 = null;
      com.aspose.slides.internal.e8b.k5 var8 = null;
      int var9 = 2;
      boolean var10 = true;

      while (var10) {
         com.aspose.slides.internal.l3e.k5 var11 = new com.aspose.slides.internal.l3e.k5(var6.n3(), var1, var2, var5, var9, var7);
         com.aspose.slides.internal.l3e.k5 var12 = var11;

         try {
            f0 var13 = new f0(var2, var1, var6.n3(), var5, var12, var9, var8);
            var4.n5(var5);
            com.aspose.slides.internal.o9b.y2 var14 = com.aspose.slides.internal.o9b.y2.n5(var0.x8().n3(), var3.n3()).n3();
            if (var14.t2() > 0 && var14.l6() > 0) {
               if (var0.a0() && var4.n5().q0() == var0.y1().q0() && var1.z1() != 3) {
                  var4.n5((com.aspose.slides.internal.b8u.a6)null);
                  var4.n5(var0.c4());
                  var4.l6(var0.y2());
                  var4.n5(var0.r4());
                  var4.k5(var3.t2() * var4.n5().z3());
                  com.aspose.slides.internal.r1x.i1 var34 = new com.aspose.slides.internal.r1x.i1(var0, var4, var3.n3(), var13);

                  try {
                     var0.n5(var14.n3(), var14.n3(), var4, var34);
                  } finally {
                     if (var34 != null) {
                        var34.dispose();
                     }
                  }
               } else {
                  e2 var15 = com.aspose.slides.internal.b7s.e2.n5(var13, var1);
                  com.aspose.slides.internal.r1x.p8 var16 = new com.aspose.slides.internal.r1x.p8(var0, var3.n3(), var15, var0.e2());

                  try {
                     com.aspose.slides.internal.b8u.x8 var17 = var16;
                     if (var0.d2()) {
                        var17 = new j3(var0.s3().h0(), var0.z3().h0(), var17);
                     }

                     if (var0.d5() && var1.y2()) {
                        var17 = new com.aspose.slides.internal.r1x.n5(com.aspose.slides.internal.o9b.c8.w4().h0(), var17);
                     }

                     var0.l6(var14.n3(), var17);
                  } finally {
                     if (var16 != null) {
                        var16.dispose();
                     }
                  }
               }
            }

            if (var13 != null) {
               var13.n5(true);
               var9 = var13.l6();
            }

            if (var9 == 2) {
               var8 = var13.n5();
               boolean var35 = com.aspose.slides.internal.l3e.k5.n5(var1);
               var9 = var35 ? 0 : 1;
            } else if (var9 == 0) {
               var7 = var12.n5();
               var9 = 1;
            } else if (var9 == 1) {
               var10 = false;
            }
         } finally {
            if (var12 != null) {
               var12.dispose();
            }
         }

         var11 = null;
         Object var33 = null;
      }
   }

   public static void l6(com.aspose.slides.internal.r1x.f0 var0, com.aspose.slides.internal.g7e.n5 var1, y0 var2, com.aspose.slides.internal.o9b.y2 var3) {
      com.aspose.slides.internal.r1x.z6 var4 = new com.aspose.slides.internal.r1x.z6();
      com.aspose.slides.internal.r1x.v4 var5 = n5(var1.z1(), var1.t4());
      com.aspose.slides.internal.o9b.y2 var6 = new com.aspose.slides.internal.o9b.y2(0, 0, var3.t2(), var3.l6());
      com.aspose.slides.internal.l3e.a6 var7 = new com.aspose.slides.internal.l3e.a6(var6.n3(), var1, var2);

      try {
         m1 var8 = new m1(var2, var5, var7);
         var4.n5(var5);
         com.aspose.slides.internal.o9b.y2 var9 = com.aspose.slides.internal.o9b.y2.n5(var0.x8().n3(), var3.n3()).n3();
         if (var9.t2() > 0 && var9.l6() > 0) {
            if (var0.a0() && var4.n5().q0() == var0.y1().q0() && var1.z1() != 3) {
               var4.n5((com.aspose.slides.internal.b8u.a6)null);
               var4.n5(var0.c4());
               var4.l6(var0.y2());
               var4.n5(var0.r4());
               var4.k5(var3.t2() * var4.n5().z3());
               com.aspose.slides.internal.r1x.i1 var27 = new com.aspose.slides.internal.r1x.i1(var0, var4, var3.n3(), var8);

               try {
                  var0.n5(var9.n3(), var9.n3(), var4, var27);
               } finally {
                  if (var27 != null) {
                     var27.dispose();
                  }
               }
            } else {
               e2 var10 = com.aspose.slides.internal.b7s.e2.n5(var8, var1);
               com.aspose.slides.internal.r1x.p8 var11 = new com.aspose.slides.internal.r1x.p8(var0, var3.n3(), var10, var0.e2());

               try {
                  com.aspose.slides.internal.b8u.x8 var12 = var11;
                  if (var0.d2() && var0.q0()) {
                     var12 = new j3(var0.s3().h0(), var0.z3().h0(), var12);
                  }

                  if (var0.d5() && var1.y2()) {
                     var12 = new com.aspose.slides.internal.r1x.n5(com.aspose.slides.internal.o9b.c8.w4().h0(), var12);
                  }

                  var0.l6(var9.n3(), var12);
               } finally {
                  if (var11 != null) {
                     var11.dispose();
                  }
               }
            }
         }
      } finally {
         if (var7 != null) {
            var7.dispose();
         }
      }
   }

   public static void k5(com.aspose.slides.internal.r1x.f0 var0, com.aspose.slides.internal.g7e.n5 var1, y0 var2, com.aspose.slides.internal.o9b.y2 var3) {
      com.aspose.slides.internal.r1x.v4 var4 = l6(var1.z1(), var1.t4());
      com.aspose.slides.internal.o9b.y2 var5 = com.aspose.slides.internal.o9b.y2.n5(var0.x8().n3(), var3.n3()).n3();
      d5 var6 = new d5();
      var6.n5(var5.t2());
      var6.l6(var5.l6());
      var6.u9(var1.m3());
      var6.h0(var1.z8());
      var6.n5(var1.j5());
      var6.k5(var1.t4() & 255);
      var6.a6(var4.z3());
      byte[] var7 = var1.w1();
      byte[] var8 = var1.r4();
      byte[] var9 = new byte[var6.a6()];
      byte[] var10 = new byte[var6.a6()];

      for (int var11 = 0; var11 < var6.a6(); var11++) {
         var9[var11] = var7 == null ? 1 : var7[var11];
         var10[var11] = var8 == null ? 1 : var8[var11];
      }

      var6.n5(var9);
      var6.l6(var10);
      var6.z1();
      e5 var23 = new e5(var2, var6);
      com.aspose.slides.internal.r1x.z6 var12 = new com.aspose.slides.internal.r1x.z6();
      var12.n5(var4);
      if (var5.t2() > 0 && var5.l6() > 0) {
         if (var0.a0() && var12.n5().q0() == var0.y1().q0() && var1.z1() != 3) {
            var12.n5((com.aspose.slides.internal.b8u.a6)null);
            var12.n5(var0.c4());
            var12.l6(var0.y2());
            var12.n5(var0.r4());
            var12.k5(var3.t2() * var12.n5().z3());
            com.aspose.slides.internal.r1x.i1 var24 = new com.aspose.slides.internal.r1x.i1(var0, var12, var3.n3(), var23);

            try {
               var0.n5(var5.n3(), var5.n3(), var12, var24);
            } finally {
               if (var24 != null) {
                  var24.dispose();
               }
            }
         } else {
            e2 var13 = com.aspose.slides.internal.b7s.e2.n5(var23, var1);
            com.aspose.slides.internal.r1x.p8 var14 = new com.aspose.slides.internal.r1x.p8(var0, var3.n3(), var13, var0.e2());

            try {
               com.aspose.slides.internal.b8u.x8 var15 = var14;
               if (var0.d2() && var0.q0()) {
                  var15 = new j3(var0.s3().h0(), var0.z3().h0(), var15);
               }

               if (var0.d5() && var1.y2()) {
                  var15 = new com.aspose.slides.internal.r1x.n5(com.aspose.slides.internal.o9b.c8.w4().h0(), var15);
               }

               var0.l6(var5.n3(), var15);
            } finally {
               if (var14 != null) {
                  var14.dispose();
               }
            }
         }
      }
   }

   public static com.aspose.slides.internal.r1x.v4 l6(int var0, int var1) {
      if (var1 != 8 && var1 != 12) {
         throw new NotSupportedException("Jpeg DCT supports only 8 or 12 bits per channel.");
      }

      com.aspose.slides.internal.r1x.v4 var2;
      switch (var0) {
         case 0:
            var2 = com.aspose.slides.internal.r1x.v4.n5(var1);
            break;
         case 1:
            var2 = com.aspose.slides.internal.r1x.v4.k5(var1);
            break;
         case 2:
            var2 = com.aspose.slides.internal.r1x.v4.u3(var1);
            break;
         case 3:
            var2 = com.aspose.slides.internal.r1x.v4.a6(var1);
            break;
         case 4:
            var2 = com.aspose.slides.internal.r1x.v4.l6(var1);
            break;
         default:
            throw new ArgumentOutOfRangeException("colorType");
      }

      return var2;
   }

   public static com.aspose.slides.internal.r1x.v4 n5(int var0, byte var1) {
      if ((var1 & 255) < 2 || (var1 & 255) > 16) {
         throw new NotSupportedException("Lossless JPEG supports only 2 - 16 bits per channel");
      }

      if ((var1 & 255) > 8) {
         throw new NotSupportedException("More than 8 bits per channel is not supported yet.");
      }

      com.aspose.slides.internal.r1x.v4 var2;
      switch (var0) {
         case 0:
            var2 = com.aspose.slides.internal.r1x.v4.n5(var1 & 255);
            break;
         case 1:
            var2 = com.aspose.slides.internal.r1x.v4.k5(var1 & 255);
            break;
         case 2:
            var2 = com.aspose.slides.internal.r1x.v4.u3(var1 & 255);
            break;
         case 3:
            var2 = com.aspose.slides.internal.r1x.v4.a6(var1 & 255);
            break;
         case 4:
            var2 = com.aspose.slides.internal.r1x.v4.l6(var1 & 255);
            break;
         default:
            throw new ArgumentOutOfRangeException("colorType");
      }

      return var2;
   }

   public static com.aspose.slides.internal.r1x.v4 l6(int var0, byte var1) {
      if ((var1 & 255) < 2 || (var1 & 255) > 16) {
         throw new NotSupportedException("JPEG-LS supports only 2-16 bits per channel");
      }

      if ((var1 & 255) > 8) {
         throw new NotSupportedException("Only 2-8 bits per channel is supported in JPEG-LS at the moment.");
      }

      com.aspose.slides.internal.r1x.v4 var2;
      switch (var0) {
         case 0:
            var2 = com.aspose.slides.internal.r1x.v4.n5(var1 & 255);
            break;
         case 1:
            var2 = com.aspose.slides.internal.r1x.v4.k5(var1 & 255);
            break;
         case 2:
            var2 = com.aspose.slides.internal.r1x.v4.u3(var1 & 255);
            break;
         case 3:
            var2 = com.aspose.slides.internal.r1x.v4.a6(var1 & 255);
            break;
         case 4:
            var2 = com.aspose.slides.internal.r1x.v4.l6(var1 & 255);
            break;
         default:
            throw new ArgumentOutOfRangeException("colorType");
      }

      return var2;
   }

   @Override
   protected void l6(com.aspose.slides.internal.z0k.t4 var1) {
      this.i1();
      n5(this, var1, this.z7(), this.o0(), this.w1(), this.e2, this.x8().n3());
   }

   @Override
   protected void n5(int var1, int var2) {
      this.t9 = var1;
      this.y4 = var2;
   }

   public static void n5(v3 var0, com.aspose.slides.internal.d0c.l6 var1) {
      if (var1 != null) {
         byte[] var2 = l6(var1);
         var0.l6(var2, 0, var2.length);
      }
   }

   public static void n5(v3 var0, com.aspose.slides.internal.t6q.s7 var1) {
      if (var1 != null) {
         byte[] var2 = l6(var1);
         var0.l6(var2, 0, var2.length);
      }
   }

   public static void k5(v3 var0) {
      var0.n5((byte)-1);
      var0.n5((byte)-40);
   }

   public static void n5(y0 var0) {
      var0.n5((byte)-1);
      var0.n5((byte)-39);
   }

   public static void n5(v3 var0, String var1) {
      if (!d1.n5(var1)) {
         byte[] var2 = com.aspose.slides.internal.l7h.j5.z3().u3(var1);
         v3 var3 = new v3(new com.aspose.slides.internal.z0k.e2(), true);

         byte[] var6;
         try {
            com.aspose.slides.internal.v6s.l6 var4 = new com.aspose.slides.internal.v6s.l6(var3);
            byte[] var5 = new byte[]{-1, -2};
            var4.n5(var5);
            var4.l6(var2.length + 2 & 65535);
            var4.n5(var2);
            var6 = var3.h0();
         } finally {
            if (var3 != null) {
               var3.dispose();
            }
         }

         var0.l6(var6, 0, var6.length);
      }
   }

   private void n5(com.aspose.slides.internal.b8u.q0 var1, int var2, int var3) {
      this.n5(var1);
      this.t9 = var2;
      this.y4 = var3;
      this.e2 = new com.aspose.slides.internal.g7e.n5();
      y4 var4 = com.aspose.slides.internal.v6g.k5.n5(var1, y4.class);
      if (var4 != null) {
         if (var4.l6() == 3) {
            this.e2.u3(var4.k5().u9().u3 & 255);
            this.e2.a6(var4.k5().u9().k5 & 255);
            this.e2.n5(var4.k5().h0());
         }

         t4 var5 = var4.k5().u3();
         n3[] var6 = var5.l6();
         byte[] var7 = new byte[var6.length];
         byte[] var8 = new byte[var6.length];

         for (int var9 = 0; var9 < var6.length; var9++) {
            var7[var9] = var6[var9].u3();
            var8[var9] = var6[var9].n3();
         }

         this.e2.n5(var7);
         this.e2.l6(var8);
         this.e2.n5(var4.l6());
      }

      com.aspose.slides.internal.r1x.p3 var10 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.r1x.p3.class);
      if (var10 != null && var10.n5() != null) {
         q0 var11 = com.aspose.slides.internal.v6g.k5.n5(var10.n5(), q0.class);
         if (var11 != null) {
            this.e2.n5(var11.o0());
            this.e2.n5(var11.b3());
            this.e2.n5(var11.z7());
            this.e2.n5(var11.w1());
         }
      }
   }

   public static q0 n5(int var0, int var1, int var2, com.aspose.slides.internal.b8u.q0 var3) {
      return new q0(var0, var1, var2, var3);
   }
}
