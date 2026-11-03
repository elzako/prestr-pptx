package com.aspose.slides.internal.h2;

import com.aspose.slides.Collections.Generic.List;

public class z7 extends a5 {
   public List<a5> n5 = new List<>();

   protected z7() {
   }

   public z7(a5 var1) {
      this();
      this.n5(var1);
   }

   public void n5(a5 var1) {
      this.n5.addItem(var1);
   }

   @Override
   public List<a5> t_() {
      return this.n5;
   }

   @Override
   public Object g_() {
      return this.n5;
   }

   @Override
   public int hashCode() {
      return this.n5.hashCode();
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }

      z7 var2 = com.aspose.slides.internal.v6g.k5.n5(obj, z7.class);
      return var2 == null ? false : com.aspose.slides.internal.v3.u3.n5(this.n5, var2.n5);
   }
}
