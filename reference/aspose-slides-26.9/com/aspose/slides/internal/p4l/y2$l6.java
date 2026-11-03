package com.aspose.slides.internal.p4l;

import com.aspose.slides.Collections.Generic.List;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class y2$l6 {
   Field[] n5;
   Constructor[] l6;
   Method[] k5;
   // $VF: synthetic field
   final y2 u3;

   private y2$l6(y2 var1) {
      this.u3 = var1;
   }

   void n5() {
      List var1 = new List();
      List var2 = new List();
      this.n5(y2.n5(this.u3), var1, var2);
      this.n5 = (Field[])var1.toArray(new Field[0]);
      this.l6 = y2.n5(this.u3).getDeclaredConstructors();
      this.k5 = (Method[])var2.toArray(new Method[0]);
   }

   private void n5(Class var1, List<Field> var2, List<Method> var3) {
      if (var1.getSuperclass() != null && var1.getSuperclass() != Object.class) {
         this.n5(var1.getSuperclass(), var2, var3);
      }

      for (Field var7 : var1.getDeclaredFields()) {
         if (var1.equals(y2.n5(this.u3))) {
            var2.addItem(var7);
         } else if (!Modifier.isPrivate(var7.getModifiers())) {
            var2.addItem(var7);
         }
      }

      for (Method var12 : var1.getDeclaredMethods()) {
         if ((!Modifier.isPrivate(var12.getModifiers()) || var1.equals(y2.n5(this.u3))) && !var12.isBridge()) {
            Method[] var8 = new Method[1];
            if (this.n5(var12, var3, var8) && !var3.removeItem(var8[0])) {
               throw new IllegalStateException();
            }

            var3.addItem(var12);
         }
      }
   }

   private boolean n5(Method var1, List<Method> var2, Method[] var3) {
      for (Method var5 : var2) {
         if (this.n5(var5, var1)) {
            var3[0] = var5;
            return true;
         }
      }

      return false;
   }

   private boolean n5(Method var1, Method var2) {
      return var1.getName().equals(var2.getName()) ? com.aspose.slides.internal.t9p.n5.n5(var1, var2.getParameterTypes()) : false;
   }

   Field[] l6() {
      if (this.n5 == null) {
         this.n5 = y2.n5(this.u3).getFields();
      }

      return this.n5;
   }

   Constructor[] k5() {
      if (this.l6 == null) {
         this.l6 = y2.n5(this.u3).getConstructors();
      }

      return this.l6;
   }

   Method[] u3() {
      if (this.k5 == null) {
         this.k5 = y2.n5(this.u3).getMethods();
      }

      return this.k5;
   }

   // $VF: synthetic method
   y2$l6(y2 var1, y1 var2) {
      this(var1);
   }
}
