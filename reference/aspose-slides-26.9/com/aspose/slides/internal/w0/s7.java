package com.aspose.slides.internal.w0;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;

public class s7 implements Cloneable {
   public static final float[] n5 = new float[]{3.0F, 1.0F};
   public static final float[] l6 = new float[]{3.0F, 1.0F, 1.0F, 1.0F};
   public static final float[] k5 = new float[]{3.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F};
   public static final float[] u3 = new float[]{1.0F, 1.0F};
   private static final float[] a6 = new float[0];
   private int u9;
   private l6 h0;
   private float[] c8 = a6;
   private int t2 = 0;
   private float s7;
   private float[] x8 = a6;
   private int n3 = 0;
   private int y4 = 0;
   private int e2 = 0;
   private float t9 = 10.0F;
   private int z1 = 0;
   private float t4 = 1.0F;

   public s7(com.aspose.slides.internal.p1s.n5 var1) {
      this(var1, 1.0F);
   }

   public s7(com.aspose.slides.internal.p1s.n5 var1, float var2) {
      this(new n3(var1), var2);
   }

   public s7(l6 var1) {
      this(var1, 1.0F);
   }

   public s7(l6 var1, float var2) {
      if (var1 == null) {
         throw new ArgumentNullException("brush");
      }

      this.h0 = var1;
      this.t4 = var2;
   }

   public final int n5() {
      return this.u9;
   }

   public final void n5(int var1) {
      this.u9 = var1;
   }

   public final float l6() {
      return this.t4;
   }

   public final void n5(float var1) {
      this.t4 = var1;
   }

   public final int k5() {
      return this.z1;
   }

   public final void l6(int var1) {
      this.z1 = var1;
   }

   public final int u3() {
      return this.y4;
   }

   public final void k5(int var1) {
      this.y4 = var1;
   }

   public final int a6() {
      return this.e2;
   }

   public final void u3(int var1) {
      this.e2 = var1;
   }

   public final l6 u9() {
      return this.h0;
   }

   public final float h0() {
      return this.t9;
   }

   public final void l6(float var1) {
      this.t9 = var1;
   }

   public final float c8() {
      return this.s7;
   }

   public final void k5(float var1) {
      this.s7 = var1;
   }

   public final int t2() {
      return this.t2;
   }

   public final void a6(int var1) {
      this.t2 = var1;
   }

   public final int s7() {
      return this.n3;
   }

   public final void u9(int var1) {
      this.n3 = var1;
      switch (this.n3) {
         case 0:
            this.x8 = a6;
            break;
         case 1:
            this.x8 = n5;
            break;
         case 2:
            this.x8 = u3;
            break;
         case 3:
            this.x8 = l6;
            break;
         case 4:
            this.x8 = k5;
         case 5:
            break;
         default:
            throw new ArgumentException("Unknown dash style.");
      }
   }

   public final float[] x8() {
      return this.x8;
   }

   public final void n5(float[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      this.x8 = var1;
      this.n3 = 5;
   }

   public final float[] n3() {
      return this.c8;
   }

   public final void l6(float[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      this.c8 = var1;
   }
}
