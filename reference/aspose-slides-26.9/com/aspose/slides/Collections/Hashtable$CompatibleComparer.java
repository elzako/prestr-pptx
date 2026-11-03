package com.aspose.slides.Collections;

import com.aspose.slides.Collections.Generic.IGenericEqualityComparer;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.v6g.k5;
import com.aspose.slides.ms.System.j3;
import java.util.Comparator;

@j3
class Hashtable$CompatibleComparer implements IGenericEqualityComparer {
   private Comparator n5;
   private IHashCodeProvider l6;

   Hashtable$CompatibleComparer(Comparator comparer, IHashCodeProvider hashCodeProvider) {
      this.n5 = comparer;
      this.l6 = hashCodeProvider;
   }

   public int n5(Object var1, Object var2) {
      if (var1 == var2) {
         return 0;
      } else if (var1 == null) {
         return -1;
      } else if (var2 == null) {
         return 1;
      } else if (this.n5 != null) {
         return this.n5.compare(var1, var2);
      } else {
         Comparable var3 = k5.n5(var1, Comparable.class);
         if (var3 == null) {
            throw new ArgumentException("At least one object must implement java.lang.Comparable");
         } else {
            return var3.compareTo(var2);
         }
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

   @Override
   public boolean equalsT(Object a, Object b) {
      return this.n5(a, b) == 0;
   }

   @Override
   public int hashCodeT(Object obj) {
      if (obj == null) {
         throw new ArgumentNullException("obj");
      } else {
         return this.l6 != null ? this.l6.hashCode(obj) : obj.hashCode();
      }
   }

   Comparator n5() {
      return this.n5;
   }

   IHashCodeProvider l6() {
      return this.l6;
   }
}
