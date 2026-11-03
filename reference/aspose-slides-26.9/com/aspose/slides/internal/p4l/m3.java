package com.aspose.slides.internal.p4l;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.TargetException;
import com.aspose.slides.exceptions.TargetInvocationException;
import com.aspose.slides.exceptions.TargetParameterCountException;
import com.aspose.slides.ms.System.y8;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;

final class m3 extends k5 {
   private final Constructor k5;
   private final int u3;
   private z3[] a6;
   private int u9;

   m3(Constructor var1, int var2) {
      this.k5 = var1;
      this.u3 = var2;
      this.u9 = this.k7();
   }

   private int k7() {
      int var1 = this.k5.getModifiers();
      byte var2 = 0;
      if (Modifier.isPublic(var1)) {
         var2 |= 6;
      }

      if (Modifier.isPrivate(var1)) {
         var2 |= 1;
      }

      if (Modifier.isProtected(var1)) {
         var2 |= 4;
      }

      return var2 | 4096;
   }

   public int m1() {
      return this.u3;
   }

   @Override
   public String s7() {
      return this.e2() ? l6 : n5;
   }

   @Override
   public Constructor n5() {
      return this.k5;
   }

   @Override
   public y8 t2() {
      return com.aspose.slides.internal.v6g.k5.n5(this.k5.getDeclaringClass());
   }

   @Override
   public Object n5(Object var1, int var2, l6 var3, Object[] var4, com.aspose.slides.internal.x7n.l6 var5) {
      if (var1 != null) {
         throw new TargetException();
      }

      int var6 = this.k5.getParameterTypes().length;
      int var7 = var4 != null ? var4.length : 0;
      if (var6 != var7) {
         throw new TargetParameterCountException("parameters do not match signature");
      }

      if (var7 <= 0) {
         return this.l6(null);
      }

      Object[] var8 = this.n5(var4, var3, var2, var5, this.k5);
      Object var9 = this.l6(var8);
      System.arraycopy(var8, 0, var4, 0, var7);
      return var9;
   }

   @Override
   public Object n5(int var1, l6 var2, Object[] var3, com.aspose.slides.internal.x7n.l6 var4) {
      int var5 = this.k5.getParameterTypes().length;
      int var6 = var3 != null ? var3.length : 0;
      if (var5 != var6) {
         throw new TargetParameterCountException("parameters do not match signature");
      }

      if (var6 <= 0) {
         return this.l6(var3);
      }

      Object[] var7 = this.n5(var3, var2, var1, var4, this.k5);
      Object var8 = this.l6(var7);
      System.arraycopy(var7, 0, var3, 0, var6);
      return var8;
   }

   private Object[] n5(Object[] var1, l6 var2, int var3, com.aspose.slides.internal.x7n.l6 var4, Constructor var5) {
      if (!com.aspose.slides.internal.t9p.n5.n5(var5, var1)) {
         throw new ArgumentException();
      } else {
         return var1;
      }
   }

   private Object l6(Object[] var1) {
      try {
         this.k5.setAccessible(true);
         return this.k5.newInstance(var1);
      } catch (Exception var3) {
         throw new TargetInvocationException(var3);
      }
   }

   @Override
   public int c8() {
      return this.u9;
   }

   @Override
   Type[] u9() {
      return this.k5.getGenericParameterTypes();
   }

   @Override
   Type h0() {
      return null;
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
            return com.aspose.slides.internal.p4l.u3.n5(this, var3);
         }
      }
   }

   @Override
   z3[] u3() {
      if (this.a6 == null) {
         this.a6 = z3.n5(this, this);
      }

      return this.a6;
   }

   @Override
   public z3[] a6() {
      z3[] var1 = this.u3();
      if (var1.length == 0) {
         return var1;
      }

      z3[] var2 = new z3[var1.length];
      com.aspose.slides.ms.System.u3.n5(var1, 0, var2, 0, var1.length);
      return var2;
   }

   @Override
   public Annotation[] x8() {
      return this.k5.getAnnotations();
   }

   @Override
   public boolean n5(y8 var1, boolean var2) {
      return com.aspose.slides.internal.p4l.u3.l6(this, var1);
   }
}
