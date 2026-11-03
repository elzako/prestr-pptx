package com.aspose.slides.Collections;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.x7n.l6;
import com.aspose.slides.internal.x7n.n5;
import com.aspose.slides.ms.System.j3;
import java.util.Comparator;

@j3
public class CaseInsensitiveComparer implements Comparator {
   private n5 n5;

   public CaseInsensitiveComparer() {
      this.n5 = l6.u3().t9();
   }

   public CaseInsensitiveComparer(l6 culture) {
      if (culture == null) {
         throw new ArgumentNullException("culture");
      }

      this.n5 = culture.t9();
   }

   public static CaseInsensitiveComparer getDefault() {
      return new CaseInsensitiveComparer(l6.u3());
   }

   public static CaseInsensitiveComparer getDefaultInvariant() {
      return new CaseInsensitiveComparer(l6.k5());
   }

   @Override
   public int compare(Object a, Object b) {
      return a instanceof String && b instanceof String ? this.n5.n5((String)a, (String)b, 1L) : Comparer.Default.compare(a, b);
   }
}
