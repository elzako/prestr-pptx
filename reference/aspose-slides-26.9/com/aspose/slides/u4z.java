package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

final class u4z extends y4f {
   private short h0 = -1;
   private short c8 = -1;
   private byte t2 = 0;
   private final boolean s7;
   private short x8 = -1;
   private final short n3 = -1;
   private short y4 = -101;
   private s4s e2 = new s4s(0.5F, 0.5F, 0.0F, 0.0F);
   private SortedList<Float, com.aspose.slides.internal.o9b.c8> t9 = null;
   private c1t z1 = new c1t();
   private com.aspose.slides.internal.x4g.m1 t4 = new com.aspose.slides.internal.x4g.m1();
   private IShape q0;
   private static final float[] z3 = new float[]{0.014F, 0.033F, 0.096F, 0.2F, 0.333F};
   private static final float[] m1 = new float[]{0.05F, 0.1F, 0.2F, 0.3F, 0.4F};

   u4z(j5m var1, GradientFormat var2, boolean var3) {
      super(var1, var3);
      this.n5 = 2;
      this.t2 = var2.getGradientShape() != -1 ? var2.getGradientShape() : 0;
      switch (var2.getGradientShape()) {
         case -1:
         case 0:
            this.h0 = 1;
            this.z1 = var2.u3();
            break;
         case 1:
         case 2:
            this.h0 = 6;
            this.z1 = var2.u3();
            var2.u9().n5(this.e2);
            break;
         case 3:
            this.a6 = var1.u3;
            this.h0 = 6;
            this.z1 = var2.u3();
            var2.u9().n5(this.e2);
      }

      if (this.e2.l6.n5 < 0.0F || this.e2.l6.l6 < 0.0F) {
         this.e2 = new s4s(this.e2.n5.u3(), d2k.a6(this.e2.l6.u3(), d2k.k5.u3()).u3());
      }

      this.y4 = 0;
      if (!com.aspose.slides.ms.System.n1.k5(var2.getLinearGradientAngle())) {
         this.x8 = this.n5(var2.getLinearGradientAngle());
      }

      this.s7 = var2.getLinearGradientScaled() > 0;
      if (var2.getGradientStops().size() != 0) {
         this.t9 = var2.n5(var1.a6);
      }

      this.c8 = 3;
   }

   u4z(j5m var1, j0p var2, boolean var3) {
      super(var1, var3);
      if (var2 == null) {
         throw new ArgumentNullException("fillprops");
      }

      this.n5 = 2;
      this.t2 = var2.getGradientShape() != -1 ? var2.getGradientShape() : 0;
      switch (var2.getGradientShape()) {
         case -1:
         case 0:
            this.h0 = 1;
            this.z1 = new c1t(var2.l6());
            break;
         case 1:
         case 2:
            this.h0 = 6;
            this.z1 = var2.l6();
            var2.k5().u3().n5(this.e2);
            break;
         case 3:
            this.a6 = var1.u3;
            this.h0 = 6;
            this.z1 = var2.l6();
            var2.k5().u3().n5(this.e2);
      }

      if (this.e2.l6.n5 < 0.0F || this.e2.l6.l6 < 0.0F) {
         this.e2 = new s4s(this.e2.n5.u3(), d2k.a6(this.e2.l6.u3(), d2k.k5.u3()).u3());
      }

      this.y4 = 0;
      if (!com.aspose.slides.ms.System.n1.k5(var2.getLinearGradientAngle())) {
         this.x8 = this.n5(var2.getLinearGradientAngle());
      }

      this.s7 = var2.getLinearGradientScaled();
      if (var1.u9 != null) {
         this.t9 = var2.n5(var1.u9.m1());
      } else {
         this.t9 = var2.u3();
      }

      this.c8 = 3;
   }

   u4z(j5m var1, j0p var2) {
      super(var1);
      this.h0 = -1;
      this.c8 = -1;
      this.t2 = 0;
      this.x8 = -1;
      this.y4 = -101;
      this.e2 = new s4s(0.5F, 0.5F, 0.0F, 0.0F);
      this.t9 = null;
      this.z1 = new c1t();
      this.t4 = new com.aspose.slides.internal.x4g.m1();
      this.n5 = 2;
      this.a6 = var1.u3;
      com.aspose.slides.internal.f8y.n5.n5(var2.getGradientShape() != -1);
      label66:
      switch (var2.getGradientShape()) {
         case -1:
            com.aspose.slides.internal.f8y.n5.n5("Must be defined");
            break;
         case 0:
            this.h0 = 1;
            this.z1 = new c1t(var2.l6());
            break;
         case 1:
         case 2:
            this.z1 = var2.l6();
            switch (var2.getGradientDirection()) {
               case -1:
               default:
                  break label66;
               case 0:
                  this.h0 = 2;
                  break label66;
               case 1:
                  this.h0 = 3;
                  break label66;
               case 2:
                  this.h0 = 4;
                  break label66;
               case 3:
                  this.h0 = 5;
                  break label66;
               case 4:
                  this.h0 = 6;
                  break label66;
            }
         case 3:
            this.z1 = var2.l6();
            this.a6 = var1.u3;
      }

      this.y4 = 0;
      if (!com.aspose.slides.ms.System.n1.k5(var2.getLinearGradientAngle())) {
         this.x8 = this.n5(var2.getLinearGradientAngle());
      }

      this.s7 = var2.getLinearGradientScaled();
      this.t2 = var2.getGradientShape();
      this.t9 = var2.a6();
      IGenericEnumerator var3 = var2.getGradientStops().iterator();

      try {
         while (var3.hasNext()) {
            IGradientStopEffectiveData var4 = (IGradientStopEffectiveData)var3.next();
            if (!this.t9.containsKey(var4.getPosition())) {
               this.t9.addItem(var4.getPosition(), ((GradientStopEffectiveData)var4).n5().o8());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      this.c8 = 3;
   }

   u4z(j5m var1, j0p var2, int var3) {
      super(var1);
      this.h0 = -1;
      this.c8 = -1;
      this.t2 = 0;
      this.x8 = -1;
      this.y4 = -101;
      this.e2 = new s4s(0.5F, 0.5F, 0.0F, 0.0F);
      this.t9 = null;
      this.z1 = new c1t();
      this.t4 = new com.aspose.slides.internal.x4g.m1();
      this.n5 = 2;
      this.a6 = var1.u3;
      label27:
      switch (var2.getGradientShape()) {
         case -1:
            com.aspose.slides.internal.f8y.n5.n5("Must be defined");
            break;
         case 0:
            this.h0 = 1;
            this.z1 = new c1t(var2.l6());
            break;
         case 1:
         case 2:
            this.z1 = var2.l6();
            switch (var2.getGradientDirection()) {
               case -1:
               default:
                  break label27;
               case 0:
                  this.h0 = 2;
                  break label27;
               case 1:
                  this.h0 = 3;
                  break label27;
               case 2:
                  this.h0 = 4;
                  break label27;
               case 3:
                  this.h0 = 5;
                  break label27;
               case 4:
                  this.h0 = 6;
                  break label27;
            }
         case 3:
            this.a6 = var1.u3;
            this.z1 = var2.l6();
      }

      this.y4 = 0;
      if (!com.aspose.slides.ms.System.n1.k5(var2.getLinearGradientAngle())) {
         this.x8 = this.n5(var2.getLinearGradientAngle());
      }

      this.s7 = var2.getLinearGradientScaled();
      this.t2 = var2.getGradientShape();
      if (var1.u9 != null) {
         this.t9 = var2.n5(var1.u9.m1());
      } else {
         this.t9 = var2.u3();
      }

      this.c8 = 3;
   }

   u4z(j5m var1, j0p var2, byte var3, boolean var4) {
      super(var1, var4);
      this.n5 = 2;
      com.aspose.slides.internal.f8y.n5.n5(var2.getGradientShape() != -1);
      this.t2 = var2.getGradientShape();
      switch (var2.getGradientShape()) {
         case -1:
            com.aspose.slides.internal.f8y.n5.n5("Must be defined");
            break;
         case 0:
            this.h0 = 1;
            this.z1 = new c1t(var2.l6());
            break;
         case 1:
         case 2:
            this.h0 = 6;
            this.z1 = new c1t(var2.l6());
            var2.k5().u3().n5(this.e2);
            break;
         case 3:
            this.a6 = var1.u3;
            this.h0 = 6;
            this.z1 = new c1t(var2.l6());
            var2.k5().u3().n5(this.e2);
      }

      if (this.e2.l6.n5 < 0.0F || this.e2.l6.l6 < 0.0F) {
         this.e2 = new s4s(this.e2.n5.u3(), d2k.a6(this.e2.l6.u3(), d2k.k5.u3()).u3());
      }

      this.y4 = 0;
      if (!com.aspose.slides.ms.System.n1.k5(var2.getLinearGradientAngle())) {
         this.x8 = this.n5(var2.getLinearGradientAngle());
      }

      this.s7 = var2.getLinearGradientScaled();
      if (var1.u9 != null) {
         this.t9 = var2.n5(var1.u9.m1());
      } else {
         this.t9 = var2.u3();
      }

      if (this.t9 != null && this.t9.size() > 0) {
         if (n5(var3)) {
            for (int var5 = 0; var5 < this.t9.size(); var5++) {
               this.t9.set_Item(this.t9.getKeys().get_Item(var5), n5(this.t9.getValues().get_Item(var5).o8(), var3).o8());
            }
         }

         if (this.t9.size() == 1) {
            this.t9.addItem(0.0F, this.t9.getValues().get_Item(0).o8());
         }
      }

      this.c8 = 3;
   }

   u4z(j5m var1, IGradientFormat var2) {
      super(var1);
      this.h0 = -1;
      this.c8 = -1;
      this.t2 = 0;
      this.x8 = -1;
      this.y4 = -101;
      this.e2 = new s4s(0.5F, 0.5F, 0.0F, 0.0F);
      this.t9 = null;
      this.z1 = new c1t();
      this.t4 = new com.aspose.slides.internal.x4g.m1();
      this.n5 = 2;
      this.a6 = var1.u3;
      label63:
      switch (var2.getGradientShape()) {
         case -1:
         case 0:
            this.h0 = 1;
            break;
         case 1:
         case 2:
            switch (var2.getGradientDirection()) {
               case -1:
               default:
                  break label63;
               case 0:
                  this.h0 = 2;
                  break label63;
               case 1:
                  this.h0 = 3;
                  break label63;
               case 2:
                  this.h0 = 4;
                  break label63;
               case 3:
                  this.h0 = 5;
                  break label63;
               case 4:
                  this.h0 = 6;
                  break label63;
            }
         case 3:
            this.a6 = var1.u3;
      }

      this.y4 = 0;
      if (!com.aspose.slides.ms.System.n1.k5(var2.getLinearGradientAngle())) {
         this.x8 = this.n5(var2.getLinearGradientAngle());
      }

      this.s7 = var2.getLinearGradientScaled() > 0;
      this.t9 = new SortedList<>();
      IGenericEnumerator var3 = var2.getGradientStops().iterator();

      try {
         while (var3.hasNext()) {
            IGradientStop var4 = (IGradientStop)var3.next();
            this.t9.addItem(var4.getPosition(), ((ColorFormat)var4.getColor()).l6(var1.a6).n5().o8());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      this.c8 = 3;
   }

   public final int y4() {
      return this.c8 >= 0 ? this.c8 : 2;
   }

   public final int e2() {
      return this.h0 >= 0 ? this.h0 : 0;
   }

   public final void l6(int var1) {
      this.h0 = (short)var1;
   }

   public final byte t9() {
      com.aspose.slides.internal.f8y.n5.n5(this.t2 != -1);
      return this.t2;
   }

   public final int z1() {
      return 0;
   }

   public final SortedList<Float, com.aspose.slides.internal.o9b.c8> t4() {
      return this.t9 != null ? new SortedList<>(this.t9) : null;
   }

   public final int q0() {
      return this.x8 >= 0 ? this.x8 : 0;
   }

   public final int z3() {
      return this.y4 >= -100 ? this.y4 : 0;
   }

   public final s4s m1() {
      return this.e2;
   }

   public final c1t k7() {
      return this.z1;
   }

   public final com.aspose.slides.internal.x4g.s7 m3() {
      return this.a6;
   }

   public final com.aspose.slides.internal.x4g.m1 z8() {
      return com.aspose.slides.internal.v6g.k5.n5(this.t4.u9(), com.aspose.slides.internal.x4g.m1.class);
   }

   public final void n5(com.aspose.slides.internal.x4g.m1 var1) {
      if (var1 == null) {
         this.t4 = new com.aspose.slides.internal.x4g.m1();
      } else {
         this.t4 = com.aspose.slides.internal.v6g.k5.n5(var1.u9(), com.aspose.slides.internal.x4g.m1.class);
      }
   }

   public final IShape j5() {
      return this.q0;
   }

   public final void n5(IShape var1) {
      this.q0 = var1;
   }

   public final float w1() {
      return this.k5(this.q0());
   }

   public final float k5(int var1) {
      float var2 = var1 + 90.0F;
      if (!this.s7) {
         return var2;
      }

      double var3 = com.aspose.slides.ms.System.q1.c8(var2 / 180.0F * Math.PI);
      double var5 = com.aspose.slides.ms.System.q1.h0(var2 / 180.0F * Math.PI);
      var3 *= this.u9.k5();
      var5 *= this.u9.s7();
      var2 = (float)(com.aspose.slides.ms.System.q1.u3(var5, var3) * 180.0 / Math.PI);
      if (var2 < 0.0F) {
         var2 += 360.0F;
      }

      return var2;
   }

   public final void n5(com.aspose.slides.internal.x4g.m3 var1) {
      float var2 = this.j5().getX() + this.j5().getWidth() / 2.0F;
      float var3 = this.j5().getY() + this.j5().getHeight() / 2.0F;
      com.aspose.slides.internal.o9b.w1 var4 = new com.aspose.slides.internal.o9b.w1(var2, var3);
      float var5 = com.aspose.slides.ms.System.q1.n5((float)(this.j5().getX() - this.u9.x8()), (float)(this.u9.s7() - this.j5().getWidth()));
      float var6 = com.aspose.slides.ms.System.q1.n5((float)(this.j5().getY() - this.u9.n3()), (float)(this.u9.k5() - this.j5().getHeight()));
      float var7 = (var2 - var1.s7().l6()) * (this.j5().getWidth() / var5);
      float var8 = (var3 - var1.s7().k5()) * (this.j5().getHeight() / var6);
      var1.n5(com.aspose.slides.internal.o9b.w1.l6(var4.u3(), new com.aspose.slides.internal.o9b.f2(var7, var8)).u3());
      var1.l6(new com.aspose.slides.internal.o9b.w1(this.j5().getWidth() / this.u9.s7(), this.j5().getHeight() / this.u9.k5()));
   }

   public final SortedList<Float, com.aspose.slides.internal.o9b.c8> l6(boolean var1) {
      return n5(var1, this.t4(), this.n5().o8(), this.l6().o8(), this.y4(), this.z1(), this.e2(), this.z3());
   }

   public final boolean r4() {
      return this.e2() == 1;
   }

   private static SortedList<Float, com.aspose.slides.internal.o9b.c8> n5(
      boolean var0,
      SortedList<Float, com.aspose.slides.internal.o9b.c8> var1,
      com.aspose.slides.internal.o9b.c8 var2,
      com.aspose.slides.internal.o9b.c8 var3,
      int var4,
      int var5,
      int var6,
      int var7
   ) {
      SortedList var8 = var1;
      if (var8 == null) {
         if (!var0) {
            return null;
         }

         com.aspose.slides.internal.o9b.c8 var9 = var2.o8();
         com.aspose.slides.internal.o9b.c8 var10 = var3.o8();
         if (var4 == 1) {
            int var11;
            int var12;
            int var13;
            if (var5 < 10) {
               var11 = (var9.x8() & 255) * var5 / 9;
               var12 = (var9.n3() & 255) * var5 / 9;
               var13 = (var9.y4() & 255) * var5 / 9;
            } else {
               var11 = (255 - (var9.x8() & 255)) * (var5 - 9) / 10 + (var9.x8() & 255);
               var12 = (255 - (var9.n3() & 255)) * (var5 - 9) / 10 + (var9.n3() & 255);
               var13 = (255 - (var9.y4() & 255)) * (var5 - 9) / 10 + (var9.y4() & 255);
            }

            com.aspose.slides.internal.o9b.c8.n5(var3.s7() & 255, var11, var12, var13).n5(var10);
         }

         var8 = new SortedList(2);
         var8.set_Item(0.0F, var9.o8());
         var8.set_Item(1.0F, var10.o8());
      }

      SortedList var15 = var8;
      float var16 = var7 / 100.0F;
      float var17 = var16;
      if (var6 < 1) {
         var17 = 1.0F - var16;
      }

      if (var17 != 1.0F) {
         int var18 = var8.size();
         if (var17 % 1.0F == 0.0F) {
            var15 = new SortedList(var18);

            for (int var19 = 0; var19 < var18; var19++) {
               var15.set_Item(1.0F - (Float)var8.getKeys().get_Item(var19), ((com.aspose.slides.internal.o9b.c8)var8.getValues().get_Item(var19)).o8());
            }
         } else {
            var15 = new SortedList(var18 * 2);
            float var20 = var17 % 1.0F;
            if (var20 > 0.0F) {
               for (int var14 = 0; var14 < var18; var14++) {
                  var15.set_Item((Float)var8.getKeys().get_Item(var14) * var20, ((com.aspose.slides.internal.o9b.c8)var8.getValues().get_Item(var14)).o8());
                  var15.set_Item(
                     var20 + (1.0F - (Float)var8.getKeys().get_Item(var14)) * (1.0F - var20),
                     ((com.aspose.slides.internal.o9b.c8)var8.getValues().get_Item(var14)).o8()
                  );
               }
            } else {
               var20++;

               for (int var22 = 0; var22 < var18; var22++) {
                  var15.set_Item(
                     (1.0F - (Float)var8.getKeys().get_Item(var22)) * var20, ((com.aspose.slides.internal.o9b.c8)var8.getValues().get_Item(var22)).o8()
                  );
                  var15.set_Item(
                     var20 + (Float)var8.getKeys().get_Item(var22) * (1.0F - var20), ((com.aspose.slides.internal.o9b.c8)var8.getValues().get_Item(var22)).o8()
                  );
               }
            }
         }
      }

      return l6(var15);
   }

   private static SortedList<Float, com.aspose.slides.internal.o9b.c8> l6(SortedList<Float, com.aspose.slides.internal.o9b.c8> var0) {
      if (var0.size() < 2) {
         return null;
      }

      SortedList var1 = new SortedList();
      float var2 = -1.0F;
      com.aspose.slides.internal.o9b.c8 var3 = com.aspose.slides.internal.o9b.c8.u3.o8();
      IGenericEnumerator var4 = var0.getKeys().iterator();

      try {
         while (var4.hasNext()) {
            float var5 = com.aspose.slides.internal.v6g.k5.u3(var4.next(), float.class);
            if (!var1.containsKey(var5)) {
               var1.addItem(var5, ((com.aspose.slides.internal.o9b.c8)var0.get_Item(var5)).o8());
            }

            if (var5 >= var2) {
               var2 = var5;
               ((com.aspose.slides.internal.o9b.c8)var0.get_Item(var5)).n5(var3);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if ((Float)var1.getKeys().get_Item(var1.size() - 1) < 1.0F) {
         var1.addItem(1.0F, var3.o8());
      }

      if (var0.size() == 2 && var1.size() == 2 && (Float)var1.getKeys().get_Item(0) == 0.0F && (Float)var1.getKeys().get_Item(1) == 1.0F) {
         r0s var18 = new r0s(((com.aspose.slides.internal.o9b.c8)var1.getValues().get_Item(0)).o8());
         r0s var6 = new r0s(((com.aspose.slides.internal.o9b.c8)var1.getValues().get_Item(1)).o8());
         if (!var6.n5(var18)) {
            float var7 = l6(var18.n5);
            float var8 = l6(var18.l6);
            float var9 = l6(var18.k5);
            float var10 = l6(var18.u3);
            float var11 = l6(var6.n5);
            float var12 = l6(var6.l6);
            float var13 = l6(var6.k5);
            float var14 = l6(var6.u3);
            var1.setCapacity(2 + z3.length * 2);

            for (int var15 = 0; var15 < z3.length; var15++) {
               var1.addItem(
                  m1[var15],
                  new r0s(
                        k5(var7 + (var11 - var7) * z3[var15]),
                        k5(var8 + (var12 - var8) * z3[var15]),
                        k5(var9 + (var13 - var9) * z3[var15]),
                        k5(var10 + (var14 - var10) * z3[var15])
                     )
                     .n5()
                     .o8()
               );
               var1.addItem(
                  1.0F - m1[var15],
                  new r0s(
                        k5(var7 + (var11 - var7) * (1.0F - z3[var15])),
                        k5(var8 + (var12 - var8) * (1.0F - z3[var15])),
                        k5(var9 + (var13 - var9) * (1.0F - z3[var15])),
                        k5(var10 + (var14 - var10) * (1.0F - z3[var15]))
                     )
                     .n5()
                     .o8()
               );
            }
         }
      }

      return var1;
   }

   private static float l6(float var0) {
      return (float)com.aspose.slides.ms.System.q1.a6(var0, 2.2F);
   }

   private static float k5(float var0) {
      return (float)com.aspose.slides.ms.System.q1.a6(var0, 0.45454544F);
   }
}
