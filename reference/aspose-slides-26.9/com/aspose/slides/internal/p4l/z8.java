package com.aspose.slides.internal.p4l;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.y8;
import java.lang.annotation.Annotation;

public class z8 extends n3 {
   private int n5;
   private w1 l6;
   private String k5;

   @Override
   public y8 t2() {
      return this.l6.t2();
   }

   @Override
   public String s7() {
      return this.k5;
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
      return new Annotation[0];
   }

   public int n5() {
      return this.n5;
   }
}
