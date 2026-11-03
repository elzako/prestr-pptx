package com.aspose.slides.internal.o9b;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidEnumArgumentException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.exceptions.OutOfMemoryException;
import com.aspose.slides.ms.System.IDisposable;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.AffineTransform;

public final class m3 implements IDisposable, com.aspose.slides.ms.System.v4, Stroke, Cloneable {
   static float[] n5 = new float[]{1.0F, 1.0F};
   static float[] l6 = new float[]{3.0F, 1.0F};
   static float[] k5 = new float[]{3.0F, 1.0F, 1.0F, 1.0F};
   static float[] u3 = new float[]{3.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F};
   private float[] c8 = new float[0];
   boolean a6 = true;
   private u3 t2;
   private int s7;
   private int x8;
   private int n3;
   private int y4;
   com.aspose.slides.internal.x4g.u9 u9;
   com.aspose.slides.internal.x4g.u9 h0;
   private int e2;
   private int t9;
   private com.aspose.slides.internal.x4g.m1 z1;
   private float t4;
   private float q0;
   private com.aspose.slides.internal.v6g.a6<float[]> z3;
   private float m1;
   private boolean k7 = false;

   public m3(u3 var1) {
      this(var1, 1.0F);
   }

   public m3(c8 var1) {
      this(var1.o8(), 1.0F);
   }

   public m3(c8 var1, float var2) {
      this(new i1(var1.o8()), var2);
   }

   public m3(u3 var1, float var2) {
      if (var1 == null) {
         throw new ArgumentNullException("Value of 'brush' cannot be null");
      }

      this.t2 = n5(var1);
      this.t4 = var2;
      this.s7 = 0;
      this.n3 = 0;
      this.x8 = 0;
      this.y4 = 0;
      this.t9 = 0;
      this.e2 = 0;
      this.m1 = 10.0F;
      this.z1 = new com.aspose.slides.internal.x4g.m1();
   }

   private void h0(int var1) {
      switch (var1) {
         case 0:
            this.z3 = new com.aspose.slides.internal.v6g.a6<>(new float[0]);
            break;
         case 1:
            this.z3 = new com.aspose.slides.internal.v6g.a6<>(l6);
            break;
         case 2:
            this.z3 = new com.aspose.slides.internal.v6g.a6<>(n5);
            break;
         case 3:
            this.z3 = new com.aspose.slides.internal.v6g.a6<>(k5);
            break;
         case 4:
            this.z3 = new com.aspose.slides.internal.v6g.a6<>(u3);
         case 5:
            break;
         default:
            throw new RuntimeException();
      }

      this.s7 = var1;
   }

   public int n5() {
      return this.t9;
   }

   public void n5(int var1) {
      this.z8();
      if (var1 < 0 || var1 > 4) {
         throw new InvalidEnumArgumentException("alignment value");
      }

      if (this.k7) {
         throw new ArgumentException("Pen is already disposed");
      }

      this.t9 = var1;
   }

   public u3 l6() {
      return (u3)this.t2.deepClone();
   }

   private static u3 n5(u3 var0) {
      if (var0 instanceof i1) {
         return ((i1)var0).c8();
      } else {
         return var0 instanceof com.aspose.slides.internal.x4g.n3 ? (u3)((com.aspose.slides.internal.x4g.n3)var0).deepClone() : (u3)var0.deepClone();
      }
   }

   private static c8 l6(u3 var0) {
      if (var0 instanceof i1) {
         return ((i1)var0).h0();
      } else if (var0 instanceof com.aspose.slides.internal.x4g.n3) {
         throw new ArgumentException("Unable to get color. HatchBrush Pen has multiple colors");
      } else {
         return com.aspose.slides.internal.o9b.c8.u3.o8();
      }
   }

   public c8 k5() {
      return l6(this.t2);
   }

   public void n5(c8 var1) {
      this.z8();
      this.t2 = new i1(var1.o8());
   }

   public boolean u3() {
      float[] var1 = this.a6();
      return var1 != null && var1.length > 1 && var1.length % 2 != 1 && (var1.length != 2 || var1[0] != 0.0F || var1[1] != 1.0F);
   }

   public float[] a6() {
      return this.c8;
   }

   public void n5(float[] var1) {
      if (var1 == null) {
         throw new NullReferenceException();
      }

      if (var1.length == 0 || var1.length % 2 == 1) {
         throw new ArgumentException();
      }

      if (this.n5() == 1) {
         throw new NotImplementedException();
      }

      float var2 = 0.0F;

      for (float var6 : var1) {
         if (var6 < var2 || var6 > 1.0F) {
            throw new ArgumentException();
         }

         var2 = var6;
      }

      this.c8 = new float[var1.length];
      com.aspose.slides.ms.System.u3.n5(var1, 0, this.c8, 0, var1.length);
   }

   public com.aspose.slides.internal.x4g.u9 u9() {
      if (this.h0 == null) {
         throw new ArgumentException("customEndCap member is null");
      } else {
         return this.m3();
      }
   }

   public void n5(com.aspose.slides.internal.x4g.u9 var1) {
      this.z8();
      if (var1 == null) {
         throw new ArgumentException("Parameter 'value' cannot be null");
      }

      this.a6(255);
      this.h0 = (com.aspose.slides.internal.x4g.u9)var1.deepClone();
   }

   public com.aspose.slides.internal.x4g.u9 h0() {
      if (this.u9 == null) {
         throw new ArgumentException("customStartCap member is null");
      } else {
         return this.k7();
      }
   }

   public void l6(com.aspose.slides.internal.x4g.u9 var1) {
      this.z8();
      if (var1 == null) {
         throw new ArgumentException("Parameter 'value' cannot be null");
      }

      this.u3(255);
      this.u9 = (com.aspose.slides.internal.x4g.u9)var1.deepClone();
   }

   private com.aspose.slides.internal.x4g.u9 k7() {
      return this.u9 != null ? (com.aspose.slides.internal.x4g.u9)this.u9.deepClone() : null;
   }

   private com.aspose.slides.internal.x4g.u9 m3() {
      return this.h0 != null ? (com.aspose.slides.internal.x4g.u9)this.h0.deepClone() : null;
   }

   public int c8() {
      return this.x8;
   }

   public void l6(int var1) {
      this.z8();
      if (var1 != 0 && var1 != 2 && var1 != 3) {
         throw new InvalidEnumArgumentException("DashCap value");
      }

      this.x8 = var1;
   }

   public float t2() {
      return this.q0;
   }

   public void n5(float var1) {
      this.z8();
      this.q0 = var1;
   }

   public float[] s7() {
      if (this.z3 == null) {
         throw new OutOfMemoryException("dashPattern");
      } else {
         return (float[])this.z3.n5.clone();
      }
   }

   public void l6(float[] var1) {
      this.z8();
      if (var1 != null && var1.length != 0) {
         for (float var5 : var1) {
            if (var5 <= 0.0F) {
               throw new ArgumentException("Parameter is invalid");
            }
         }

         this.s7 = 5;
         this.z3 = new com.aspose.slides.internal.v6g.a6<>(var1);
      } else {
         throw new ArgumentException("Argument 'value' is invalid");
      }
   }

   public int x8() {
      return this.s7;
   }

   public void k5(int var1) {
      this.z8();
      if (var1 >= 0 && var1 <= 5) {
         this.h0(var1);
         if (var1 == 5 && (this.z3 == null || this.z3.n5 == null || this.z3.n5.length == 0)) {
            this.z3 = new com.aspose.slides.internal.v6g.a6<>(new float[]{1.0F});
         }
      } else {
         throw new InvalidEnumArgumentException("DashStyle value");
      }
   }

   public int n3() {
      return this.n3;
   }

   public void u3(int var1) {
      this.z8();
      switch (var1) {
         case 0:
         case 1:
         case 2:
         case 3:
         case 16:
         case 17:
         case 18:
         case 19:
         case 20:
         case 240:
         case 255:
            this.u9 = null;
            this.n3 = var1;
            return;
         default:
            throw new InvalidEnumArgumentException("StartCap value");
      }
   }

   public int y4() {
      return this.y4;
   }

   public void a6(int var1) {
      this.z8();
      switch (var1) {
         case 0:
         case 1:
         case 2:
         case 3:
         case 16:
         case 17:
         case 18:
         case 19:
         case 20:
         case 240:
         case 255:
            this.h0 = null;
            this.y4 = var1;
            return;
         default:
            throw new InvalidEnumArgumentException("EndCap value");
      }
   }

   public int e2() {
      return this.e2;
   }

   public void u9(int var1) {
      this.z8();
      if (var1 >= 0 && var1 <= 3) {
         this.e2 = var1;
      } else {
         throw new InvalidEnumArgumentException("LineJoin");
      }
   }

   public float t9() {
      return this.m1;
   }

   public void l6(float var1) {
      this.z8();
      this.m1 = var1 < 1.0F ? 1.0F : var1;
   }

   public int z1() {
      if (this.l6() instanceof u6) {
         return 2;
      } else if (this.l6() instanceof com.aspose.slides.internal.x4g.n3) {
         return 1;
      } else if (this.l6() instanceof com.aspose.slides.internal.x4g.z3) {
         return 4;
      } else {
         return this.l6() instanceof com.aspose.slides.internal.x4g.m3 ? 3 : 0;
      }
   }

   public com.aspose.slides.internal.x4g.m1 t4() {
      return this.z1.u9();
   }

   public void n5(com.aspose.slides.internal.x4g.m1 var1) {
      this.z8();
      if (var1 == null) {
         throw new ArgumentNullException("Value of 'value' cannot be null");
      }

      if (!var1.k5()) {
         throw new ArgumentException("Matrix 'value' must be invertible");
      }

      var1.n5(this.z1);
   }

   public float q0() {
      return this.t4;
   }

   public float z3() {
      return this.t4 < 0.0F ? 0.0F : this.t4;
   }

   public void k5(float var1) {
      this.z8();
      this.t4 = var1;
   }

   @Override
   public Object deepClone() {
      m3 var1 = (m3)this.m1();
      if (var1.z1 != null) {
         var1.z1 = var1.z1.u9();
      }

      if (var1.z3 != null && var1.z3.n5 != null) {
         var1.z3.n5 = (float[])var1.z3.n5.clone();
      }

      var1.a6 = true;
      return var1;
   }

   @Override
   public void dispose() {
      this.n5(true);
   }

   private void n5(boolean var1) {
      if (!this.a6 && var1) {
         throw new ArgumentException("You may not change this Pen because it does not belong to you.");
      }

      this.k7 = true;
      if (!var1) {
         this.a6 = true;
      }
   }

   private void z8() {
      if (!this.a6) {
         throw new ArgumentException("Pen object is immutable");
      }
   }

   @Override
   public Shape createStrokedShape(Shape arg_0) {
      return this.n5(null, 0).createStrokedShape(arg_0);
   }

   protected Object m1() {
      try {
         return this.clone();
      } catch (CloneNotSupportedException var2) {
         throw new IllegalStateException(var2);
      }
   }

   Stroke n5(AffineTransform var1, int var2) {
      return this.n5(null, var1, var2, false, false, false, null);
   }

   Stroke n5(AffineTransform var1, AffineTransform var2, int var3, boolean var4, boolean var5, boolean var6, z1 var7) {
      float[] var8 = null;
      int var9 = this.c8();
      switch (this.x8()) {
         case 0:
            var9 = 0;
            break;
         case 1:
            var8 = new float[l6.length];

            for (int var16 = 0; var16 < var8.length; var16++) {
               var8[var16] = l6[var16] * this.z3();
            }
            break;
         case 2:
            var8 = new float[n5.length];

            for (int var15 = 0; var15 < var8.length; var15++) {
               var8[var15] = n5[var15] * this.z3();
            }
            break;
         case 3:
            var8 = new float[k5.length];

            for (int var14 = 0; var14 < var8.length; var14++) {
               var8[var14] = k5[var14] * this.z3();
            }
            break;
         case 4:
            var8 = new float[u3.length];

            for (int var13 = 0; var13 < var8.length; var13++) {
               var8[var13] = u3[var13] * this.z3();
            }
            break;
         case 5:
            if (this.z3 != null) {
               if (this.z3.n5.length == 1) {
                  var8 = null;
               } else if (this.z3.n5.length % 2 != 0) {
                  var8 = new float[((float[])this.z3.n5).length + 1];
                  var8[var8.length - 1] = 0.0F;
               } else {
                  var8 = new float[((float[])this.z3.n5).length];
               }

               float var10 = this.q0() < 1.0 ? 1.0F : this.q0();
               if (var8 != null) {
                  int var11 = 0;

                  for (int var12 = 0; var11 < ((float[])this.z3.n5).length; var12++) {
                     var8[var12] = this.z3.n5[var11] * var10;
                     var11++;
                  }
               }
            }
      }

      int var17 = var4 ? 0 : this.e2();
      AffineTransform var18 = this.z1.t2();
      if (var4) {
         var18 = this.l6(this.z1).t2();
      }

      if (var1 != null && !var1.isIdentity() && this.q0() < 1.0F) {
         var18 = (AffineTransform)var18.clone();
         var18.concatenate(var1);
      }

      return var5
         ? z7.n5(this.q0() >= 1.0F ? this.q0() : 1.0F, this.n3(), this.y4(), var17, this.t9(), var8, this.t2(), var18, var2, var3)
         : z7.n5(
            !(this.q0() >= 1.0F) && (!var6 || !(this.q0() >= 0.0F)) ? 1.0F : this.q0(),
            this.n3(),
            this.y4(),
            var17,
            this.t9(),
            var8,
            this.t2(),
            var9,
            var18,
            var2,
            var3,
            var7
         );
   }

   public com.aspose.slides.internal.x4g.m1 l6(com.aspose.slides.internal.x4g.m1 var1) {
      float[] var2 = com.aspose.slides.internal.c9b.u3.l6(var1);
      double var3 = var2[0];
      double var5 = var2[1];
      double var7 = Math.abs(var3);
      double var9 = Math.abs(var5);
      if (var7 < 1.0 && var7 > 0.0) {
         var3 = 1.0 / (this.q0() * var3);
      }

      if (var9 < 1.0 && var9 > 0.0) {
         var5 = 1.0 / (this.q0() * var5);
      }

      float[] var11 = var1.n5();
      return new com.aspose.slides.internal.x4g.m1((float)var5, var11[1], var11[2], (float)var3, var11[4], var11[5]);
   }
}
