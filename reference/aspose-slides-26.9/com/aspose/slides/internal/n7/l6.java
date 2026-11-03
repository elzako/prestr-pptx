package com.aspose.slides.internal.n7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.a4.a3;
import com.aspose.slides.internal.a4.b3;
import com.aspose.slides.internal.a4.e9;
import com.aspose.slides.internal.a4.p3;
import com.aspose.slides.internal.a4.p8;
import com.aspose.slides.internal.a4.s3;
import com.aspose.slides.internal.a4.v0;
import com.aspose.slides.internal.a4.v3;
import com.aspose.slides.internal.a4.x9;
import com.aspose.slides.internal.b9.e2;
import com.aspose.slides.internal.b9.s9;
import com.aspose.slides.internal.i0.g7;
import com.aspose.slides.internal.i0.s0;
import com.aspose.slides.internal.l5.c8;
import com.aspose.slides.internal.l5.n3;
import com.aspose.slides.internal.l5.t2;
import com.aspose.slides.internal.l5.y4;
import com.aspose.slides.internal.o9b.a0;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.o9b.z1;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.internal.x4g.s7;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.q1;

public class l6 extends n5 {
   private z1 l6;
   private u3 k5 = new u3();
   private e2 u3 = null;
   private List<b3> a6 = null;
   private List<Object> u9 = new List<>();

   public l6(com.aspose.slides.internal.d9.n5 var1) {
      super(var1);
      this.l6 = z1.n5(new com.aspose.slides.internal.o9b.l6(1, 1));
      this.u3 = new e2();
      this.u3.n5(726027589L);
      this.a6 = new List<>();
      this.u3.n5(this.a6.toArray(new b3[0]));
      this.u3.k5();
      this.n5(this.u3);
   }

   public final com.aspose.slides.internal.d9.n5 n5() {
      return (com.aspose.slides.internal.d9.n5)this.n5;
   }

   @Override
   public void dispose() {
      this.c8();
      this.u3 = null;
      this.a6 = null;
      this.u9 = null;
      this.k5 = null;
   }

   @Override
   public void n5(c8 var1, y1 var2, y1 var3, int var4) {
      this.n5(var1, this.n5(var2.y4()), var3.y4(), var4);
   }

   public void n5(c8 var1, w1[] var2, y1 var3, int var4) {
      this.n5(var1, var2, var3.y4(), var4, null);
   }

   public void n5(c8 var1, w1[] var2, y1 var3, int var4, t2 var5) {
      n5(var3.y4(), var4, 2).a6(var3);
      if (var4 != 1 && var4 != 2 && var4 != 0) {
         float var6 = var1.c8() / this.u9();
         float var7 = var1.t2() / this.h0();
         var3 = new y1(var3.x8() * var6, var3.n3() * var7, var3.s7() * var6, var3.k5() * var7);
      }

      this.n5(var1, var2, var3.y4(), var5);
   }

   private void n5(c8 var1, w1[] var2, y1 var3, t2 var4) {
      if (var1 == null) {
         throw new ArgumentNullException("image");
      }

      if (var2 == null) {
         throw new ArgumentNullException("destPoints");
      }

      if (var2.length != 3) {
         throw new ArgumentException("The destPoints parameter should specify three points of a parallelogram.");
      }

      com.aspose.slides.internal.a4.e2 var5 = new com.aspose.slides.internal.a4.e2();
      var5.n5(this.n5(var1, var4));
      var5.n5(false);
      var5.l6(false);
      var5.k5(false);
      var5.n5(this.n5(var4));
      var5.k5(2);
      var5.n5(new g7(var3.y4()));
      var5.l6(3L);
      var5.n5(new s0[]{new s0(var2[0].u3()), new s0(var2[1].u3()), new s0(var2[2].u3())});
      var5.k7();
      this.n5(var5);
   }

   public final y1 n5(a0 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("region");
      } else {
         return var1.n5(this.l6);
      }
   }

   private float u9() {
      return 96.0F;
   }

   @Override
   public void n5(c8 var1, y2 var2, float var3, float var4, float var5, float var6, int var7) {
      this.n5(var1, var2.n3(), var3, var4, var5, var6, var7, null);
   }

   @Override
   public void n5(c8 var1, y2 var2, float var3, float var4, float var5, float var6, int var7, t2 var8) {
      y1 var9 = new y1(var3, var4, var5, var6);
      n5(var9.y4(), var7, 2).a6(var9);
      w1[] var10 = this.n5(y1.n5(var2).y4());
      if (var7 != 1 && var7 != 2 && var7 != 0) {
         float var11 = var1.c8() / this.u9();
         float var12 = var1.t2() / this.h0();
         var9 = new y1(var9.x8() * var11, var9.n3() * var12, var9.s7() * var11, var9.k5() * var12);
      }

      this.n5(var1, var10, var9.y4(), var8);
   }

   private float h0() {
      return 96.0F;
   }

   @Override
   public void n5(n3 var1, s7 var2) {
      if (var1 == null) {
         throw new ArgumentNullException("pen");
      }

      if (var2 == null) {
         throw new ArgumentNullException("path");
      }

      if (var2.u3().n5() != null && var2.u3().n5().length != 0) {
         com.aspose.slides.internal.a4.z1 var3 = new com.aspose.slides.internal.a4.z1();
         var3.n5((long)(this.n5(var1) & 0xFF));
         var3.n5(this.n5(var2));
         var3.k7();
         this.n5(var3);
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.l5.l6 var1, s7 var2) {
      if (var1 == null) {
         throw new ArgumentNullException("brush");
      }

      if (var2 == null) {
         throw new ArgumentNullException("path");
      }

      if (var2.u3().n5() != null && var2.u3().n5().length != 0) {
         com.aspose.slides.internal.a4.w1 var3 = new com.aspose.slides.internal.a4.w1();
         var3.n5(this.n5(var2));
         this.n5(var1, var3);
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.l5.l6 var1, y1 var2) {
      this.n5(var1, new y1[]{var2});
   }

   public void n5(com.aspose.slides.internal.l5.l6 var1, y1[] var2) {
      if (var1 == null) {
         throw new ArgumentNullException("brush");
      }

      if (var2 == null) {
         throw new ArgumentNullException("rects");
      }

      com.aspose.slides.internal.a4.y1 var3 = new com.aspose.slides.internal.a4.y1();
      var3.n5(var2.length & 4294967295L);
      g7[] var4 = new g7[var2.length];

      for (int var5 = 0; var5 < var2.length; var5++) {
         var4[var5] = new g7(var2[var5].y4());
      }

      var3.n5(var4);
      this.n5(var1, var3);
   }

   @Override
   public void n5(m1 var1, int var2) {
      this.l6.n5(var1, var2);
      s3 var3 = new s3();
      var3.n5(com.aspose.slides.internal.n7.k5.n5(var1));
      var3.n5(var2 == 1);
      var3.k7();
      this.n5(var3);
   }

   @Override
   public a0 l6() {
      return this.l6.u9();
   }

   @Override
   public void l6(a0 var1) {
      this.n5(var1, 0);
   }

   @Override
   public void n5(y1 var1, int var2) {
      this.l6.n5(var1.y4(), var2);
      a3 var3 = new a3();
      var3.n5(new g7(var1.y4()));
      var3.l6((byte)var2);
      var3.k7();
      this.n5(var3);
   }

   @Override
   public void n5(a0 var1, int var2) {
      if (var1 == null) {
         throw new ArgumentNullException("region");
      }

      this.l6.n5(var1, var2);
      p3 var3 = new p3();
      var3.a6(this.k5(var1));
      var3.l6((byte)var2);
      var3.k7();
      this.n5(var3);
   }

   @Override
   public int k5() {
      return this.l6.c8();
   }

   @Override
   public void n5(int var1) {
      if (this.l6.c8() != var1) {
         this.l6.n5(var1);
         x9 var2 = new x9();
         var2.n5((byte)this.l6.c8());
         var2.k7();
         this.n5(var2);
      }
   }

   @Override
   public int u3() {
      return this.l6.t9();
   }

   @Override
   public void l6(int var1) {
      if (this.l6.t9() != var1) {
         this.l6.a6(var1);
         e9 var2 = new e9();
         var2.n5((byte)this.l6.t9());
         var2.k7();
         this.n5(var2);
      }
   }

   @Override
   public void k5(int var1) {
      if (this.l6.t4() != var1) {
         this.l6.u9(var1);
         v0 var2 = new v0();
         var2.n5((byte)this.l6.t4());
         var2.n5(this.l6.t4() == 4 || this.l6.t4() == 2);
         var2.k7();
         this.n5(var2);
      }
   }

   @Override
   public m1 a6() {
      return this.l6.m1();
   }

   @Override
   public void n5(m1 var1) {
      this.l6.l6(var1);
      v3 var2 = new v3();
      var2.n5(com.aspose.slides.internal.n7.k5.n5(this.l6.m1()));
      var2.k7();
      this.n5(var2);
   }

   private void n5(com.aspose.slides.internal.l5.l6 var1, com.aspose.slides.internal.a4.y2 var2) {
      var2.n5(com.aspose.slides.internal.v6g.k5.l6(var1, y4.class));
      var2.u3(this.n5(var1));
      var2.k7();
      this.n5(var2);
   }

   private void n5(b3 var1) {
      this.a6.addItem(var1);
   }

   private void n5(s9 var1) {
      this.n5().n5().n5(this.n5().n5().size() - 2, var1);
      this.n5().y4();
   }

   private void c8() {
      int var1 = (int)this.u3.c8();
      List$Enumerator var2 = this.a6.iterator();

      try {
         while (var2.hasNext()) {
            b3 var3 = (b3)var2.next();
            var1 += var3.h0();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      this.u3.n5(this.a6.toArray(new b3[0]));
      this.u3.u3(var1 & 4294967295L);
      this.u3.t2((int)this.u3.c8() + 12);
      this.n5().y4();
   }

   private w1[] n5(y1 var1) {
      return new w1[]{new w1(var1.x8(), var1.n3()), new w1(var1.x8() + var1.s7(), var1.n3()), new w1(var1.x8(), var1.n3() + var1.k5())};
   }

   private byte n5(n3 var1) {
      byte var2;
      if (this.k5.n5(var1)) {
         var2 = this.k5.l6(var1);
      } else {
         var2 = this.k5.k5(var1);
         p8 var3 = new p8();
         var3.n5((byte)2);
         var3.n5(com.aspose.slides.internal.n7.k5.n5(var1));
         var3.l6(var2);
         var3.k7();
         this.n5(var3);
      }

      return var2;
   }

   private byte n5(s7 var1) {
      byte var2;
      if (this.k5.n5(var1)) {
         var2 = this.k5.l6(var1);
      } else {
         var2 = this.k5.k5(var1);
         p8 var3 = new p8();
         var3.n5((byte)3);
         var3.n5(com.aspose.slides.internal.n7.k5.n5(var1));
         var3.l6(var2);
         var3.k7();
         this.n5(var3);
      }

      return var2;
   }

   private byte k5(a0 var1) {
      byte var2;
      if (this.k5.n5(var1)) {
         var2 = this.k5.l6(var1);
      } else {
         var2 = this.k5.k5(var1);
         p8 var3 = new p8();
         var3.n5((byte)4);
         var3.n5(com.aspose.slides.internal.n7.k5.n5(var1));
         var3.l6(var2);
         var3.k7();
         this.n5(var3);
      }

      return var2;
   }

   private long n5(t2 var1) {
      long var2 = 4294967295L;
      if (var1 != null) {
         if (this.k5.n5(var1)) {
            var2 = this.k5.l6(var1) & 0xFF;
         } else {
            var2 = this.k5.k5(var1) & 0xFF;
            p8 var4 = new p8();
            var4.n5((byte)8);
            var4.n5(com.aspose.slides.internal.n7.k5.n5(var1));
            var4.l6((byte)var2);
            var4.k7();
            this.n5(var4);
         }
      }

      return var2;
   }

   private byte n5(c8 var1, t2 var2) {
      if (var2 != null) {
         com.aspose.slides.internal.o9b.l6 var3 = com.aspose.slides.internal.n7.k5.n5(var1, var2);
         var1 = new com.aspose.slides.internal.l5.u3(var3);
      }

      byte var5;
      if (this.k5.n5(var1)) {
         var5 = this.k5.l6(var1);
      } else {
         var5 = this.k5.k5(var1);
         p8 var4 = new p8();
         var4.n5((byte)5);
         var4.n5(com.aspose.slides.internal.n7.k5.n5(var1));
         var4.l6(var5);
         var4.k7();
         this.n5(var4);
      }

      return var5;
   }

   private int n5(com.aspose.slides.internal.l5.l6 var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1, y4.class)) {
         return ((y4)var1).l6().h0();
      }

      byte var2;
      if (this.k5.n5(var1)) {
         var2 = this.k5.l6(var1);
      } else {
         var2 = this.k5.k5(var1);
         p8 var3 = new p8();
         var3.n5((byte)1);
         var3.n5(com.aspose.slides.internal.n7.k5.n5(var1));
         var3.l6(var2);
         var3.k7();
         this.n5(var3);
      }

      return var2 & 0xFF;
   }

   private static float n5(float var0, int var1, int var2, float var3, float var4) {
      if ((var1 == 1 || var1 == 2 || var1 == 0) && (var2 == 1 || var2 == 2 || var2 == 0) && q1.n5(var3 - var4) < 0.001) {
         return var0;
      }

      float var5;
      switch (var1) {
         case 0:
         case 2:
            var5 = var0 / var3;
            break;
         case 1:
            var5 = var0 / var3;
            break;
         case 3:
            var5 = var0 / 72.0F;
            break;
         case 4:
            var5 = var0;
            break;
         case 5:
            var5 = var0 / 300.0F;
            break;
         case 6:
            var5 = var0 / 25.4F;
            break;
         default:
            throw new ArgumentException("Invalid GraphicsUnit");
      }

      float var6;
      switch (var2) {
         case 0:
         case 2:
            var6 = var5 * var4;
            break;
         case 1:
            var6 = var5 * var4;
            break;
         case 3:
            var6 = var5 * 72.0F;
            break;
         case 4:
            var6 = var5;
            break;
         case 5:
            var6 = var5 * 300.0F;
            break;
         case 6:
            var6 = var5 * 25.4F;
            break;
         default:
            throw new ArgumentException("Invalid GraphicsUnit");
      }

      return var6;
   }

   private static float n5(float var0, int var1, int var2) {
      return n5(var0, var1, var2, 96.0F, 96.0F);
   }

   private static y1 n5(y1 var0, int var1, int var2) {
      return new y1(n5(var0.x8(), var1, var2), n5(var0.n3(), var1, var2), n5(var0.s7(), var1, var2), n5(var0.k5(), var1, var2));
   }
}
