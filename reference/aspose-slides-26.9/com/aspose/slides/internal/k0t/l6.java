package com.aspose.slides.internal.k0t;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.k4d.u3;
import com.aspose.slides.internal.k9.h0;
import com.aspose.slides.internal.k9.u9;
import com.aspose.slides.internal.o9b.t4;
import com.aspose.slides.internal.s5.a6;
import com.aspose.slides.internal.s5.c8;
import com.aspose.slides.internal.s5.s7;
import com.aspose.slides.internal.w0.x8;
import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.internal.z4.a0;
import com.aspose.slides.internal.z4.p8;
import com.aspose.slides.ms.System.d1;

public class l6 extends p8 {
   private h0 u3;
   private byte[] a6;
   private c8 u9;
   private int h0;
   protected u3 n5;
   private com.aspose.slides.internal.f1s.l6 c8;
   private int t2;
   protected k5 k5;
   private a0 s7;
   private int x8;
   private a6 n3 = null;

   public l6(com.aspose.slides.internal.z4.c8 var1, byte[] var2, c8 var3, a6 var4) {
      super(var1);
      this.a6 = var2;
      x8 var5 = null;
      Integer var6 = null;
      if (this.h0().l6().q0() && this.h0().l6().t4() != null) {
         com.aspose.slides.internal.o9b.l6 var7 = null;
         com.aspose.slides.internal.o9b.l6[] var8 = new com.aspose.slides.internal.o9b.l6[]{var7};
         boolean var9 = this.h0().n5(this.a6, var8) && t4.k5(var8[0].s7());
         var7 = var8[0];
         if (var9) {
            var5 = com.aspose.slides.internal.j7.n5.n5(var7, false, false);
            if (var5.k5()) {
               if (this.l6.l6().c8() && !this.l6.e2()) {
                  var6 = this.k5(var5);
               }

               this.a6 = null;
               var5 = null;
               this.a6 = this.n5(var2);
            }
         }
      }

      if (var6 == null && this.l6.l6().c8()) {
         if (!this.l6.e2()) {
            var6 = this.k5(var5);
         }

         Object var10 = null;
      }

      this.u9 = var3;
      this.h0 = this.l6.l6().h0();
      this.n3 = var4;
      if (this.l6.l6().c8()) {
         this.h0 = this.l6.e2() ? l6(this.a6) : var6;
      } else {
         this.h0 = l6(this.a6);
      }
   }

   private byte[] n5(byte[] var1) {
      try {
         com.aspose.slides.internal.j7.n5 var2 = new com.aspose.slides.internal.j7.n5(var1);

         try {
            var2.n5(this.h0().l6().t4());
            e2 var3 = new e2();

            try {
               if (var2.u9() == 4) {
                  var2.n5(var3, 4);
               } else {
                  var2.n5(var3, 5);
               }

               var1 = var3.toArray();
            } finally {
               if (var3 != null) {
                  var3.dispose();
               }
            }
         } finally {
            if (var2 != null) {
               var2.dispose();
            }
         }
      } catch (RuntimeException var14) {
         var1 = com.aspose.slides.internal.s5.s7.l6();
      }

      return var1;
   }

   private int k5(x8 var1) {
      com.aspose.slides.internal.j7.n5 var2 = this.z1();

      try {
         u3 var3 = this.n5;
         com.aspose.slides.internal.f1s.l6 var4 = this.c8;
         int var5 = this.t2;
         this.n5 = com.aspose.slides.internal.k4d.u3.n5(var2.l6(), var2.k5(), var2.u3(), var2.a6());
         var1 = var1 == null ? com.aspose.slides.internal.j7.n5.n5(var2.c8(), false, false) : var1;
         this.c8 = com.aspose.slides.internal.f1s.l6.n5(var1.u3());
         this.t2 = var1.a6();
         byte var6 = 5;
         e2 var7 = new e2();

         long var8;
         try {
            var2.l6(var7, this.l6.l6().t2());
            var8 = this.n5(var7.toArray(), var6);
         } finally {
            if (var7 != null) {
               var7.dispose();
            }
         }

         long var11 = this.n5(var1.n5(), 2);
         if (var11 < var8) {
            var8 = var11;
            var6 = 2;
         }

         var11 = this.n5(var1.n5(), 3);
         if (var11 < var8) {
            var6 = 3;
         }

         this.n5 = var3;
         this.c8 = var4;
         this.t2 = var5;
         return var6;
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   private long n5(byte[] var1, int var2) {
      int var3 = this.h0;
      this.h0 = var2;
      com.aspose.slides.internal.c1.n5 var4 = this.a6();

      try {
         e2 var5 = new e2();

         try {
            com.aspose.slides.internal.z0k.t4 var6 = var4.n5(var5);

            try {
               var6.write(var1, 0, var1.length);
               return var6.getLength();
            } finally {
               if (var6 != null) {
                  var6.dispose();
               }
            }
         } finally {
            if (var5 != null) {
               var5.dispose();
            }
         }
      } finally {
         this.h0 = var3;
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.z4.t4 var1) {
      try {
         this.a6(var1);
      } catch (RuntimeException var3) {
         this.a6 = com.aspose.slides.internal.s5.s7.l6();
         this.u9 = null;
         this.a6(var1);
      }
   }

   private void a6(com.aspose.slides.internal.z4.t4 var1) {
      com.aspose.slides.internal.j7.n5 var2 = this.z1();

      try {
         this.n5 = com.aspose.slides.internal.k4d.u3.n5(var2.l6(), var2.k5(), var2.u3(), var2.a6());
         if (var2.h0() == 1) {
            this.n5(var2.x8());
            if (this.h0 == 5) {
               this.h0 = 2;
            }
         }

         this.k5(var2);
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }

      this.k5(var1);
      Object var6 = null;
      this.a6 = null;
      this.t9();
      if (this.s7 != null) {
         this.s7.n5(var1);
         this.s7 = null;
      }

      if (this.k5 != null) {
         this.k5.n5(var1);
         this.k5 = null;
      }
   }

   protected void k5(com.aspose.slides.internal.z4.t4 var1) {
      this.u3(var1);
   }

   protected final void u3(com.aspose.slides.internal.z4.t4 var1) {
      super.n5(var1);
   }

   private com.aspose.slides.internal.j7.n5 z1() {
      if (this.u9 != null && this.u9.l6()) {
         return this.u9.n5(this.a6);
      }

      if (this.h0().l6().j5() == null) {
         return new com.aspose.slides.internal.j7.n5(this.a6);
      }

      com.aspose.slides.internal.o9b.l6 var1 = null;
      com.aspose.slides.internal.o9b.l6[] var2 = new com.aspose.slides.internal.o9b.l6[]{var1};
      boolean var3 = !this.h0().n5(this.a6, var2);
      var1 = var2[0];
      if (var3) {
         var1 = com.aspose.slides.internal.j7.n5.n5(this.a6);
         this.h0().l6().j5().n5(this.l6(), new u9(var1, this.a6));
      }

      return new com.aspose.slides.internal.j7.a6(var1, this.a6);
   }

   private void k5(com.aspose.slides.internal.j7.n5 var1) {
      switch (this.h0) {
         case 5:
            this.n5(var1);
            break;
         case 6:
         case 7:
            this.n5(var1, true);
            break;
         default:
            this.n5(var1, false);
      }
   }

   protected final void n5(com.aspose.slides.internal.j7.n5 var1) {
      this.l6(var1);
      int var2 = var1.h0();
      boolean var3 = !this.l6.e2();
      boolean var4 = !var3;
      x8 var5 = com.aspose.slides.internal.j7.n5.n5(var1.c8(), false, var4);
      var1.dispose();
      Object var6 = null;
      this.n5(var5, var3);
      switch (var2) {
         case 0:
            this.c8 = com.aspose.slides.internal.f1s.l6.l6();
            this.t2 = 8;
            break;
         case 1:
         default:
            throw new InvalidOperationException("Unexpected color model.");
         case 2:
            this.c8 = com.aspose.slides.internal.f1s.l6.n5();
            this.t2 = 8;
      }
   }

   protected void l6(com.aspose.slides.internal.j7.n5 var1) {
      var1.l6(this.k5(), this.l6.l6().t2());
   }

   private void n5(com.aspose.slides.internal.j7.n5 var1, boolean var2) {
      boolean var3 = !this.l6.e2();
      boolean var4 = !var3;
      x8 var5 = this.n5(var1, var2, var4);
      this.l6(var5);
      this.c8 = com.aspose.slides.internal.f1s.l6.n5(var5.u3());
      this.t2 = var5.a6();
      this.n5(var5, var3);
   }

   protected void n5(x8 var1, boolean var2) {
      if (var1.k5() && var2) {
         this.k5 = new k5(this.l6, var1.l6(), this.n5(var1), this.n5.n5(), this.n5.l6());
      }
   }

   protected int n5(x8 var1) {
      return var1.l6().length;
   }

   protected void l6(x8 var1) {
      this.n5(var1.n5(), 0, var1.n5().length);
   }

   protected x8 n5(com.aspose.slides.internal.j7.n5 var1, boolean var2, boolean var3) {
      return com.aspose.slides.internal.j7.n5.n5(var1.c8(), var2, var3);
   }

   public void n5() {
      this.h0().l6().j5().l6(this.u3);
   }

   public h0 l6() {
      if (this.u3 == null) {
         this.u3 = com.aspose.slides.internal.k9.h0.n5(this.a6);
      }

      return this.u3;
   }

   private void n5(com.aspose.slides.internal.p1s.n5[] var1) {
      this.s7 = new a0(this.l6);
      this.x8 = var1.length;

      for (int var2 = 0; var2 < this.x8; var2++) {
         this.s7.n5((byte)var1[var2].k5());
         this.s7.n5((byte)var1[var2].u3());
         this.s7.n5((byte)var1[var2].a6());
      }
   }

   @Override
   public com.aspose.slides.internal.c1.n5 a6() {
      switch (this.h0) {
         case 0:
            return null;
         case 1:
            return new com.aspose.slides.internal.c1.u9();
         case 2:
            return new com.aspose.slides.internal.c1.u3();
         case 3:
         case 4:
            com.aspose.slides.internal.c1.a6 var1 = new com.aspose.slides.internal.c1.a6();
            var1.k5(this.t2);
            var1.l6(this.n5.n5());
            var1.n5(this.c8.u9());
            var1.n5(this.h0 == 3);
            return var1;
         case 5:
            return new com.aspose.slides.internal.c1.k5();
         case 6:
         case 7:
            return new com.aspose.slides.internal.c1.l6(this.h0, this.n5);
         default:
            throw new InvalidOperationException("Unknown image compression filter type.");
      }
   }

   @Override
   public void l6(com.aspose.slides.internal.z4.t4 var1) {
      var1.k5("/Type", "/XObject");
      var1.k5("/Subtype", "/Image");
      var1.n5("/Width", this.n5.n5());
      var1.n5("/Height", this.n5.l6());
      if (this.n3 != null) {
         int[] var2 = new int[]{this.n3.n5().k5(), this.n3.l6().k5(), this.n3.n5().u3(), this.n3.l6().u3(), this.n3.n5().a6(), this.n3.l6().a6()};
         var1.n5("/Mask", (int[])var2);
      }

      if (this.c8 == com.aspose.slides.internal.f1s.l6.k5()) {
         var1.k5("/ColorSpace", d1.n5("[/{0}/DeviceRGB {1} {2}]", this.c8.a6(), this.x8 - 1, this.s7.t2()));
      } else {
         var1.k5("/ColorSpace", d1.n5("/{0}", new Object[]{this.c8.a6()}));
      }

      var1.n5("/BitsPerComponent", this.t2);
      if (this.k5 != null) {
         var1.k5("/SMask", this.k5.t2());
      }
   }

   private static int l6(byte[] var0) {
      return com.aspose.slides.internal.k4d.a6.l6(var0) == 4 ? 5 : 2;
   }
}
