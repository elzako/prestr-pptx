package com.aspose.slides.Collections.Generic;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.v6g.h0;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.j8;

@Deprecated
@j3
public class List$EnumeratorJava<T> extends h0<List$EnumeratorJava<T>> implements IGenericEnumerator<T>, IDisposable {
   private List<T> l6 = new List<>();
   private int k5;
   private int u3;
   private T a6;
   // $VF: synthetic field
   static final boolean n5 = !List.class.desiredAssertionStatus();

   public List$EnumeratorJava() {
   }

   List$EnumeratorJava(List<T> l) {
      this();
      this.l6 = l;
      this.u3 = l.getVersion();
   }

   @Override
   public void dispose() {
   }

   private void n5() {
      if (this.u3 != this.l6.getVersion()) {
         throw new InvalidOperationException("Collection was modified; enumeration operation may not execute.");
      }
   }

   @Override
   public T next() {
      if (this.k5 < 0 || this.k5 >= this.l6.size() + 1) {
         throw new InvalidOperationException("Enumeration has either not started or has already finished.");
      } else if (this.u3 == this.l6.getVersion()) {
         this.a6 = this.l6.get_Item(this.k5++);
         return this.a6;
      } else {
         throw new InvalidOperationException("Collection was modified; enumeration operation may not execute.");
      }
   }

   @Override
   public boolean hasNext() {
      if (this.u3 == this.l6.getVersion()) {
         return this.k5 < 0 ? false : this.k5 < this.l6.size();
      } else {
         throw new InvalidOperationException("Collection was modified; enumeration operation may not execute.");
      }
   }

   @Override
   public void reset() {
      this.n5();
      this.k5 = 0;
   }

   @Override
   public void remove() {
      throw new NotImplementedException();
   }

   public void CloneTo(List$EnumeratorJava<T> that) {
      that.l6 = this.l6;
      that.k5 = this.k5;
      that.u3 = this.u3;
      that.a6 = this.a6;
   }

   public List$EnumeratorJava<T> Clone() {
      List$EnumeratorJava var1 = new List$EnumeratorJava();
      this.CloneTo(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.Clone();
   }

   private boolean n5(List$EnumeratorJava var1) {
      return j8.n5(var1.l6, this.l6) && var1.k5 == this.k5 && var1.u3 == this.u3 && j8.n5(var1.a6, this.a6);
   }

   @Override
   public boolean equals(Object obj) {
      assert obj != null;
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof List$EnumeratorJava) ? false : this.n5((List$EnumeratorJava)obj);
      }
   }

   public static boolean equals(List$EnumeratorJava obj1, List$EnumeratorJava obj2) {
      return obj1.equals(obj2);
   }

   @Override
   public int hashCode() {
      int var1 = this.l6 != null ? this.l6.hashCode() : 0;
      var1 = 31 * var1 + this.k5;
      var1 = 31 * var1 + this.u3;
      return 31 * var1 + (this.a6 != null ? this.a6.hashCode() : 0);
   }
}
