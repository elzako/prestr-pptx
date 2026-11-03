package com.aspose.slides.Collections;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.x7n.e2;
import com.aspose.slides.internal.x7n.l6;
import com.aspose.slides.ms.System.t9;

@Deprecated
public class CaseInsensitiveHashCodeProvider implements IHashCodeProvider {
   static CaseInsensitiveHashCodeProvider n5 = new CaseInsensitiveHashCodeProvider(com.aspose.slides.internal.x7n.l6.k5());
   static CaseInsensitiveHashCodeProvider l6;
   static final Object k5 = new Object();
   private e2 u3;

   public CaseInsensitiveHashCodeProvider() {
      l6 var1 = com.aspose.slides.internal.x7n.l6.u3();
      if (!n5(var1, com.aspose.slides.internal.x7n.l6.k5())) {
         this.u3 = com.aspose.slides.internal.x7n.l6.u3().n3();
      }
   }

   public CaseInsensitiveHashCodeProvider(l6 culture) {
      if (culture == null) {
         throw new ArgumentNullException("culture");
      }

      if (!n5(culture, com.aspose.slides.internal.x7n.l6.k5())) {
         this.u3 = culture.n3();
      }
   }

   public static CaseInsensitiveHashCodeProvider getDefault() {
      synchronized (k5) {
         if (l6 == null) {
            l6 = new CaseInsensitiveHashCodeProvider();
         } else if (l6.u3 == null) {
            if (!n5(com.aspose.slides.internal.x7n.l6.u3(), com.aspose.slides.internal.x7n.l6.k5())) {
               l6 = new CaseInsensitiveHashCodeProvider();
            }
         } else if (!n5(l6.u3, com.aspose.slides.internal.x7n.l6.u3())) {
            l6 = new CaseInsensitiveHashCodeProvider();
         }

         return l6;
      }
   }

   static boolean n5(l6 var0, l6 var1) {
      return var0.t2() == var1.t2();
   }

   static boolean n5(e2 var0, l6 var1) {
      return var0.l6() == var1.t2();
   }

   public static CaseInsensitiveHashCodeProvider getDefaultInvariant() {
      return n5;
   }

   @Override
   public int hashCode(Object obj) {
      if (obj == null) {
         throw new ArgumentNullException("obj");
      }

      String var2 = obj instanceof String ? (String)obj : null;
      if (var2 == null) {
         return obj.hashCode();
      }

      int var3 = 0;
      if (this.u3 != null && !n5(this.u3, com.aspose.slides.internal.x7n.l6.k5())) {
         var2 = this.u3.n5(var2);

         for (int var7 = 0; var7 < var2.length(); var7++) {
            char var8 = var2.charAt(var7);
            var3 = var3 * 31 + var8;
         }
      } else {
         for (int var4 = 0; var4 < var2.length(); var4++) {
            char var5 = t9.n5(var2.charAt(var4), com.aspose.slides.internal.x7n.l6.k5());
            var3 = var3 * 31 + var5;
         }
      }

      return var3;
   }
}
