package com.aspose.slides.internal.p4l;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.FieldAccessException;
import com.aspose.slides.exceptions.TargetException;
import com.aspose.slides.ms.System.y8;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class j5 extends y4 {
   private final Field n5;
   private final int l6;
   private int k5;

   public j5(Field var1, int var2) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = this.y4();
   }

   public int n3() {
      return this.l6;
   }

   @Override
   public Field u3() {
      return this.n5;
   }

   @Override
   public int n5() {
      return this.k5;
   }

   private int y4() {
      int var1 = this.n5.getModifiers();
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

      if (Modifier.isStatic(var1)) {
         var2 |= 16;
      }

      return var2;
   }

   @Override
   public y8 a6() {
      return com.aspose.slides.internal.v6g.k5.n5(this.n5.getType());
   }

   @Override
   public Object n5(Object var1) {
      if (!this.u9() && var1 == null) {
         throw new TargetException("The field is non-static and obj is null");
      }

      try {
         return this.n5.get(var1);
      } catch (IllegalArgumentException var3) {
         throw new ArgumentException("The method is neither declared nor inherited by the class of obj");
      } catch (IllegalAccessException var4) {
         throw new FieldAccessException("The caller does not have permission to access this field");
      }
   }

   @Override
   public void n5(Object var1, Object var2, int var3, l6 var4, com.aspose.slides.internal.x7n.l6 var5) {
      try {
         this.n5.set(var1, var2);
      } catch (IllegalArgumentException var7) {
         throw new ArgumentException("");
      } catch (IllegalAccessException var8) {
         throw new FieldAccessException("The caller does not have permission to access this field");
      }
   }

   @Override
   public y8 t2() {
      return com.aspose.slides.internal.v6g.k5.n5(this.n5.getDeclaringClass());
   }

   @Override
   public String s7() {
      return this.n5.getName();
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
            return u3.l6(this, var3);
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
            return u3.n5(this, var3);
         }
      }
   }

   @Override
   public Annotation[] x8() {
      return this.n5.getAnnotations();
   }
}
