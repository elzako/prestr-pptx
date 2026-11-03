package com.aspose.slides.Collections;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.x7n.l6;
import com.aspose.slides.internal.x7n.n5;
import com.aspose.slides.ms.System.j3;
import java.util.Comparator;

@j3
public final class Comparer implements Comparator {
   public static final Comparer Default = new Comparer(l6.u3());
   public static final Comparer DefaultInvariant = new Comparer(l6.k5());
   private n5 n5;

   private Comparer() {
      this.n5 = null;
   }

   public Comparer(l6 culture) {
      if (culture == null) {
         throw new ArgumentNullException("culture");
      }

      this.n5 = culture.t9();
   }

   @Override
   public int compare(Object a, Object b) {
      if (a == b) {
         return 0;
      }

      if (a == null) {
         return -1;
      }

      if (b == null) {
         return 1;
      }

      if (this.n5 != null && a instanceof String && b instanceof String) {
         return this.n5.n5((String)a, (String)b);
      }

      try {
         if (a instanceof Comparable) {
            return ((Comparable)a).compareTo(b);
         }

         if (b instanceof Comparable) {
            return ((Comparable)b).compareTo(a);
         }
      } catch (ClassCastException var4) {
         throw new ArgumentException("value A is not of the same type as B");
      }

      throw new ArgumentException("At least one object must implement Comparable.");
   }
}
