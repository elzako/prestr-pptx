package com.aspose.slides.internal.p4l;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.TargetInvocationException;
import com.aspose.slides.exceptions.TargetParameterCountException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.y8;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;

final class w1 extends q0 {
   final Method n5;
   private String x8;
   final int l6;
   final int k5;
   z3[] u3;
   z3 a6;
   q0 u9 = null;
   boolean h0;
   boolean c8;
   boolean t2;
   boolean s7 = false;

   w1(Method var1, int var2) {
      this.n5 = var1;
      this.x8 = this.c4();
      this.l6 = var2;
      this.k5 = this.y2();
   }

   private String c4() {
      String var1 = this.n5.getName();
      com.aspose.slides.internal.v6g.u3 var2 = this.n5.getAnnotation(com.aspose.slides.internal.v6g.u3.class);
      if (var2 != null) {
         String var3 = var2.n5();
         var1 = d1.n5(var1, var3, "_" + var3);
      }

      com.aspose.slides.internal.v6g.l6 var5 = this.n5.getAnnotation(com.aspose.slides.internal.v6g.l6.class);
      if (var5 != null) {
         String var4 = var5.n5();
         var1 = d1.l6(var1, 0, 4) + var4;
      }

      return var1;
   }

   public int j5() {
      return this.l6;
   }

   @Override
   public Method m1() {
      return this.n5;
   }

   @Override
   public q0 n5() {
      if (this.u9 == null) {
         y8 var1 = this.t2();
         y8 var2 = var1.n5();
         q0 var3 = this;

         while (var2 != null && !var2.y2()) {
            Class[] var4 = this.n5.getParameterTypes();
            y8[] var5 = new y8[var4.length];

            for (int var6 = 0; var6 < var5.length; var6++) {
               var5[var6] = com.aspose.slides.internal.v6g.k5.n5(var4[var6]);
            }

            q0 var7 = var2.n5(this.s7(), var5);
            if (var7 != null) {
               var3 = var7;
            }

            var2 = var2.n5();
         }

         this.u9 = var3;
      }

      return this.u9;
   }

   @Override
   Type[] u9() {
      return this.n5.getGenericParameterTypes();
   }

   @Override
   Type h0() {
      return this.n5.getGenericReturnType();
   }

   @Override
   z3[] u3() {
      this.w1();
      return this.u3;
   }

   @Override
   public z3[] a6() {
      this.w1();
      if (this.u3.length == 0) {
         return this.u3;
      }

      z3[] var1 = new z3[this.u3.length];
      com.aspose.slides.ms.System.u3.n5(this.u3, 0, var1, 0, this.u3.length);
      return var1;
   }

   z3[] w1() {
      if (this.u3 == null) {
         this.u3 = z3.n5(this, this);
      }

      return this.u3;
   }

   @Override
   public Object n5(Object var1, int var2, l6 var3, Object[] var4, com.aspose.slides.internal.x7n.l6 var5) {
      int var6 = this.n5.getParameterTypes().length;
      int var7 = var4 != null ? var4.length : 0;
      if (var6 != var7) {
         throw new TargetParameterCountException("parameters do not match signature");
      }

      if (var7 <= 0) {
         return this.l6(var1, null);
      }

      Object[] var8 = this.n5(var4, var3, var2, var5, this.n5);
      Object var9 = this.l6(var1, var8);
      System.arraycopy(var8, 0, var4, 0, var7);
      return var9;
   }

   private Object[] n5(Object[] var1, l6 var2, int var3, com.aspose.slides.internal.x7n.l6 var4, Method var5) {
      for (int var6 = 0; var6 < var1.length; var6++) {
         Class[] var7 = var5.getParameterTypes();
         if (var1[var6] == null && com.aspose.slides.internal.v6g.k5.n5(var7[var6]).y1()) {
            var1[var6] = com.aspose.slides.internal.v6g.k5.k5(var7[var6]);
         }
      }

      return var1;
   }

   private Object l6(Object var1, Object[] var2) {
      try {
         return this.n5.invoke(var1, var2);
      } catch (Exception var4) {
         throw new TargetInvocationException(var4.getMessage(), var4);
      }
   }

   @Override
   public int c8() {
      return this.k5;
   }

   private int y2() {
      int var1 = this.n5.getModifiers();
      short var2 = 0;
      if (Modifier.isPublic(var1)) {
         var2 |= 6;
      }

      if (Modifier.isPrivate(var1)) {
         var2 |= 1;
      }

      if (Modifier.isProtected(var1)) {
         var2 |= 4;
      }

      if (Modifier.isStatic(var1)) {
         var2 |= 16;
      }

      if (this.y1()) {
         var2 |= 2048;
      }

      if (Modifier.isFinal(var1)) {
         var2 |= 32;
      }

      if (Modifier.isAbstract(var1)) {
         var2 |= 1024;
      }

      return var2;
   }

   private boolean y1() {
      String var1 = this.s7();
      if (var1.length() < 5) {
         return false;
      }

      this.h0 = d1.l6(var1, "get_");
      this.c8 = d1.l6(var1, "set_");
      this.t2 = d1.l6(var1, "add_");
      this.s7 = d1.l6(var1, "remove_");
      return this.h0 || this.c8 || this.t2 || this.s7;
   }

   @Override
   public y8 t2() {
      return com.aspose.slides.internal.v6g.k5.n5(this.n5.getDeclaringClass());
   }

   @Override
   public String s7() {
      return this.x8;
   }

   @Override
   public y8 k5() {
      return null;
   }

   @Override
   public boolean n5(y8 var1, boolean var2) {
      if (var1 == null) {
         throw new ArgumentNullException("attributeType");
      } else {
         c4 var3 = com.aspose.slides.internal.v6g.k5.n5(var1.m1(), c4.class);
         if (var3 == null) {
            throw new ArgumentException("Argument must be a Type", "attributeType");
         } else {
            return com.aspose.slides.internal.p4l.u3.l6(this, var3, var2);
         }
      }
   }

   @Override
   public Object[] l6(y8 var1, boolean var2) {
      if (var1 == null) {
         throw new ArgumentNullException("attributeType");
      } else {
         c4 var3 = com.aspose.slides.internal.v6g.k5.n5(var1.m1(), c4.class);
         if (var3 == null) {
            throw new ArgumentException("Type must be a type provided by the runtime.", "attributeType");
         } else {
            return com.aspose.slides.internal.p4l.u3.n5(this, var3, var2);
         }
      }
   }

   @Override
   public y8 k7() {
      return this.z8().n5();
   }

   @Override
   public q0 m3() {
      return null;
   }

   @Override
   public boolean z3() {
      return false;
   }

   @Override
   public boolean q0() {
      return false;
   }

   @Override
   public z3 z8() {
      this.r4();
      return this.a6;
   }

   z3 r4() {
      if (this.a6 == null) {
         this.a6 = z3.l6(this, this);
      }

      return this.a6;
   }

   @Override
   public int n3() {
      return super.n3();
   }

   @Override
   public Annotation[] x8() {
      return this.n5.getAnnotations();
   }
}
