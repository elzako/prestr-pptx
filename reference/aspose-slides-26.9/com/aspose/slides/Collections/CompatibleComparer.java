package com.aspose.slides.Collections;

import com.aspose.slides.Collections.Generic.IGenericEqualityComparer;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import java.util.Comparator;

public class CompatibleComparer implements IGenericEqualityComparer, Comparator {
   private Comparator n5;

   @Override
   public int compare(Object a, Object b) {
      if (a == b) {
         return 0;
      } else if (a == null) {
         return -1;
      } else if (b == null) {
         return 1;
      } else if (this.n5 != null) {
         return this.n5.compare(a, b);
      } else if (Comparable.class.isAssignableFrom(a.getClass())) {
         return ((Comparable)a).compareTo(b);
      } else {
         throw new ArgumentException("At least one object must implement java.lang.Comparable");
      }
   }

   @Override
   public boolean equalsT(Object a, Object b) {
      return this.compare(a, b) == 0;
   }

   @Override
   public int hashCodeT(Object obj) {
      if (obj == null) {
         throw new ArgumentNullException("obj");
      } else {
         return obj.hashCode();
      }
   }

   @Override
   public boolean equals(Object x, Object y) {
      return this.equalsT(x, y);
   }

   @Override
   public int hashCode(Object obj) {
      return this.hashCodeT(obj);
   }

   public Comparator getComparer() {
      return this.n5;
   }
}
