package com.aspose.slides.internal.y6;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.z0k.n3;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.j8;

public abstract class l6 extends com.aspose.slides.internal.l5.c8 {
   private a6 n5 = new a6();

   protected l6() {
   }

   public l6(int var1, int var2) {
   }

   public static l6 n5(String var0) {
      n3 var1 = new n3(var0, 3);

      try {
         return n5(var1);
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }

   public static l6 n5(t4 var0) {
      com.aspose.slides.internal.k3.n5 var1 = new com.aspose.slides.internal.k3.n5(var0);
      if (var1.l6()) {
         return var1.n5();
      } else {
         com.aspose.slides.internal.k3.k5 var2 = new com.aspose.slides.internal.k3.k5(var0);
         if (var2.l6()) {
            return var2.n5();
         } else {
            throw new ArgumentException("Unable to read Metafile.");
         }
      }
   }

   public final a6 n5() {
      return this.n5;
   }

   public abstract int l6();

   public abstract y2 k5();

   protected final boolean n5(l6 var1) {
      return j8.n5(this.n5, var1.n5);
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return j8.n5(obj) != j8.n5(this) ? false : this.n5((l6)obj);
      }
   }

   @Override
   public int hashCode() {
      return this.n5 != null ? this.n5.hashCode() : 0;
   }

   @Override
   public com.aspose.slides.internal.o9b.l6 u3() {
      return com.aspose.slides.internal.o1.k5.n5(this).u3();
   }

   @Override
   public void dispose() {
      this.n5 = null;
   }
}
