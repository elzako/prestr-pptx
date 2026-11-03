package com.aspose.slides.Collections.Generic;

import com.aspose.slides.Collections.DictionaryEntry;
import com.aspose.slides.Collections.IDictionaryEnumerator;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.internal.v6g.h0;
import com.aspose.slides.internal.v6g.u9;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.j8;

@Deprecated
@j3
public class Dictionary$EnumeratorJava<TKey, TValue>
   extends h0<Dictionary$EnumeratorJava>
   implements IGenericEnumerator<KeyValuePair<TKey, TValue>>,
   IDictionaryEnumerator<KeyValuePair<TKey, TValue>> {
   private Dictionary<TKey, TValue> k5;
   private int u3;
   private int a6;
   KeyValuePair<TKey, TValue> n5 = new KeyValuePair<>();
   private static final u9 u9 = new u9("Version", "Comparer", "HashSize", "KeyValuePairs");
   // $VF: synthetic field
   static final boolean l6 = !Dictionary.class.desiredAssertionStatus();

   public Dictionary$EnumeratorJava() {
   }

   Dictionary$EnumeratorJava(Dictionary<TKey, TValue> dictionary) {
      this();
      this.k5 = dictionary;
      this.a6 = Dictionary.n5(dictionary);
   }

   @Override
   public boolean hasNext() {
      this.k5();
      if (this.u3 < 0) {
         return false;
      }

      int var1 = this.u3;

      while (this.u3 < Dictionary.l6(this.k5)) {
         var1 = var1++;
         if ((Dictionary.k5(this.k5)[var1].HashCode & -2147483648) != 0) {
            return true;
         }
      }

      return false;
   }

   public KeyValuePair<TKey, TValue> next() {
      this.k5();

      while (this.u3 < Dictionary.l6(this.k5)) {
         int var1 = this.u3++;
         if ((Dictionary.k5(this.k5)[var1].HashCode & -2147483648) != 0) {
            this.n5 = new KeyValuePair<>((TKey)Dictionary.u3(this.k5)[var1], (TValue)Dictionary.a6(this.k5)[var1]);
            return this.n5;
         }
      }

      this.u3 = -1;
      return null;
   }

   @Override
   public void remove() {
      throw new NotSupportedException();
   }

   TKey n5() {
      this.u3();
      return this.n5.getKey();
   }

   TValue l6() {
      this.u3();
      return this.n5.getValue();
   }

   @Override
   public void reset() {
      this.k5();
      this.u3 = 0;
   }

   @Override
   public DictionaryEntry getEntry() {
      this.u3();
      return new DictionaryEntry(this.n5.getKey(), this.n5.getValue());
   }

   @Override
   public Object getKey() {
      return this.n5();
   }

   @Override
   public Object getValue() {
      return this.l6();
   }

   private void k5() {
      if (this.k5 == null) {
         throw new ObjectDisposedException(this.getClass().getName());
      }

      if (Dictionary.n5(this.k5) != this.a6) {
         throw new InvalidOperationException("out of sync");
      }
   }

   private void u3() {
      this.k5();
      if (this.u3 < 0) {
         throw new InvalidOperationException("Current is not valid");
      }
   }

   @Override
   public void dispose() {
      this.k5 = null;
   }

   public void CloneTo(Dictionary$EnumeratorJava that) {
      that.k5 = this.k5;
      that.u3 = this.u3;
      that.a6 = this.a6;
      this.n5.CloneTo(that.n5);
   }

   public Dictionary$EnumeratorJava Clone() {
      Dictionary$EnumeratorJava var1 = new Dictionary$EnumeratorJava();
      this.CloneTo(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.Clone();
   }

   private boolean n5(Dictionary$EnumeratorJava var1) {
      return j8.n5(var1.k5, this.k5) && var1.u3 == this.u3 && var1.a6 == this.a6 && j8.n5(var1.n5, this.n5);
   }

   @Override
   public boolean equals(Object obj) {
      assert obj != null;
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof Dictionary$EnumeratorJava) ? false : this.n5((Dictionary$EnumeratorJava)obj);
      }
   }

   public static boolean equals(Dictionary$EnumeratorJava obj1, Dictionary$EnumeratorJava obj2) {
      return obj1.equals(obj2);
   }

   @Override
   public int hashCode() {
      int var1 = this.k5 != null ? this.k5.hashCode() : 0;
      var1 = 31 * var1 + this.u3;
      var1 = 31 * var1 + this.a6;
      return 31 * var1 + (this.n5 != null ? this.n5.hashCode() : 0);
   }
}
