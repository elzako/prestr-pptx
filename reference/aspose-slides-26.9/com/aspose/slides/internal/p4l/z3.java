package com.aspose.slides.internal.p4l;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.ms.System.y8;
import java.lang.annotation.Annotation;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class z3 {
   private y8 n5;
   private e2 l6;
   private String k5;
   private int u3;
   private int a6;

   protected z3() {
   }

   public z3(y8 var1, e2 var2, String var3, int var4, int var5) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
      this.a6 = var5;
   }

   public y8 n5() {
      return this.n5;
   }

   public int l6() {
      return this.a6;
   }

   public boolean k5() {
      return (this.l6() & 16) != 0;
   }

   public e2 u3() {
      return this.l6;
   }

   public int a6() {
      return this.u3;
   }

   public boolean n5(y8 var1, boolean var2) {
      return com.aspose.slides.internal.p4l.u3.l6(this, var1);
   }

   static z3[] n5(t4 var0, e2 var1) {
      z3 var2 = null;
      z3[] var3 = new z3[]{var2};
      z3[] var4 = n5(var0, var3, false);
      var2 = var3[0];
      return var4;
   }

   static z3[] n5(t4 var0, z3[] var1, boolean var2) {
      Type[] var3 = var0.u9();
      boolean var4 = false;
      if (var0 instanceof k5) {
         y8 var5 = var0.t2();
         var4 = var5.z8() && !Modifier.isStatic(var5.z1().getModifiers());
      }

      Type var11 = var0.h0();
      z3[] var6 = var2 ? null : new z3[var4 ? var3.length - 1 : var3.length];
      if (var2) {
         var1[0] = n5(var11, var0, 0);
      } else {
         int var7 = var4 ? 1 : 0;
         int var8 = 0;

         for (int var9 = var3.length; var7 < var9; var8++) {
            Type var10 = var3[var7];
            var6[var8] = n5(var10, var0, var8);
            var7++;
         }
      }

      return var6;
   }

   static z3 n5(Type var0, t4 var1, int var2) {
      if (var0 instanceof Class) {
         Class var5 = (Class)var0;
         return new z3(com.aspose.slides.internal.v6g.k5.n5(var5), var1, var5.getName(), var2, 0);
      }

      try {
         Type var3 = ((ParameterizedType)var0).getRawType();
         return n5(var3, var1, var2);
      } catch (Exception var4) {
         throw new NotImplementedException();
      }
   }

   public Annotation[] u9() {
      Annotation[] var1 = null;
      e2 var2 = this.u3();
      if (var2 instanceof q0) {
         z3[] var3 = ((q0)var2).a6();
         int var4 = 0;

         for (z3 var8 : var3) {
            if (var8.equals(this)) {
               break;
            }

            var4++;
         }

         var1 = ((q0)var2).m1().getParameterAnnotations()[var4];
      } else if (var2 instanceof k5) {
         z3[] var9 = ((k5)var2).a6();
         int var10 = 0;

         for (z3 var14 : var9) {
            if (var14.equals(this)) {
               break;
            }

            var10++;
         }

         var1 = ((k5)var2).n5().getParameterAnnotations()[var10];
      }

      return var1;
   }

   static z3 l6(t4 var0, e2 var1) {
      Object var2 = null;
      z3[] var3 = new z3[]{(z3)var2};
      n5(var0, var3, true);
      return var3[0];
   }
}
