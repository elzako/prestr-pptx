package com.aspose.slides.Collections.Specialized;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.IHashCodeProvider;
import com.aspose.slides.Collections.Generic.IGenericEqualityComparer;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.u3;
import java.util.Comparator;

@j3
public class NameValueCollection extends NameObjectCollectionBase {
   private String[] n5 = null;
   private String[] l6 = null;

   public NameValueCollection() {
   }

   public NameValueCollection(int capacity) {
      super(capacity);
   }

   public NameValueCollection(NameValueCollection col) {
      super(col == null ? null : col.n5(), col == null ? null : col.l6(), col == null ? null : col.k5());
      if (col == null) {
         throw new ArgumentNullException("col");
      }

      this.add(col);
   }

   @Deprecated
   public NameValueCollection(IHashCodeProvider hashProvider, Comparator comparer) {
      super(hashProvider, comparer);
   }

   public NameValueCollection(int capacity, NameValueCollection col) {
      super(capacity, col == null ? null : col.k5(), col == null ? null : col.l6());
      this.add(col);
   }

   @Deprecated
   public NameValueCollection(int capacity, IHashCodeProvider hashProvider, Comparator comparer) {
      super(capacity, hashProvider, comparer);
   }

   public NameValueCollection(IGenericEqualityComparer equalityComparer) {
      super(equalityComparer);
   }

   public NameValueCollection(int capacity, IGenericEqualityComparer equalityComparer) {
      super(capacity, equalityComparer);
   }

   public String[] getAllKeys() {
      if (this.n5 == null) {
         this.n5 = this.baseGetAllKeys();
      }

      return this.n5;
   }

   public String get_Item(int index) {
      return this.get(index);
   }

   public String get_Item(String name) {
      return this.get(name);
   }

   public void set_Item(String name, String value) {
      this.set(name, value);
   }

   public void add(NameValueCollection c) {
      if (this.isReadOnly()) {
         throw new NotSupportedException("Collection is read-only");
      }

      if (c == null) {
         throw new ArgumentNullException("c");
      }

      this.invalidateCachedArrays();
      int var2 = c.size();

      for (int var3 = 0; var3 < var2; var3++) {
         String var4 = c.getKey(var3);
         String[] var5 = c.getValues(var3);
         if (var5 != null && var5.length > 0) {
            for (String var9 : var5) {
               this.add(var4, var9);
            }
         } else {
            this.add(var4, null);
         }
      }
   }

   public void add(String name, String value) {
      if (this.isReadOnly()) {
         throw new NotSupportedException("Collection is read-only");
      }

      this.invalidateCachedArrays();
      ArrayList var3 = (ArrayList)this.baseGet(name);
      if (var3 == null) {
         var3 = new ArrayList();
         if (value != null) {
            var3.addItem(value);
         }

         this.baseAdd(name, var3);
      } else if (value != null) {
         var3.addItem(value);
      }
   }

   public void clear() {
      if (this.isReadOnly()) {
         throw new NotSupportedException("Collection is read-only");
      }

      this.invalidateCachedArrays();
      this.baseClear();
   }

   @Override
   public void copyTo(u3 dest, int index) {
      if (dest == null) {
         throw new ArgumentNullException("dest", "Null argument - dest");
      }

      if (index < 0) {
         throw new ArgumentOutOfRangeException("index", "index is less than 0");
      }

      if (dest.u3() > 1) {
         throw new ArgumentException("dest", "multidim");
      }

      if (dest.a6() - index < this.size()) {
         throw new ArgumentException(
            "The number of elements in the collection is greater than the available space from index to the end of the destination array"
         );
      }

      if (this.l6 == null) {
         this.u3();
      }

      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.l6)), 0, dest, index, this.l6.length);
   }

   private void u3() {
      this.l6 = null;
      int var1 = this.size();
      this.l6 = new String[var1];

      for (int var2 = 0; var2 < var1; var2++) {
         this.l6[var2] = this.get(var2);
      }
   }

   public String get(int index) {
      ArrayList var2 = (ArrayList)this.baseGet(index);
      return n5(var2);
   }

   public String get(String name) {
      ArrayList var2 = (ArrayList)this.baseGet(name);
      return n5(var2);
   }

   private static String n5(ArrayList var0) {
      char var1 = ',';
      if (var0 == null) {
         return null;
      }

      int var2 = var0.size();
      switch (var2) {
         case 0:
            return null;
         case 1:
            return (String)var0.get_Item(0);
         case 2:
            return d1.n5(new Object[]{(String)var0.get_Item(0), var1, (String)var0.get_Item(1)});
         default:
            int var3 = var2;

            for (int var4 = 0; var4 < var2; var4++) {
               var3 += ((String)var0.get_Item(var4)).length();
            }

            a5 var6 = new a5((String)var0.get_Item(0), var3);

            for (int var5 = 1; var5 < var2; var5++) {
               var6.n5(var1);
               var6.n5(var0.get_Item(var5));
            }

            return var6.toString();
      }
   }

   public String getKey(int index) {
      return this.baseGetKey(index);
   }

   public String[] getValues(int index) {
      ArrayList var2 = (ArrayList)this.baseGet(index);
      return l6(var2);
   }

   public String[] getValues(String name) {
      ArrayList var2 = (ArrayList)this.baseGet(name);
      return l6(var2);
   }

   private static String[] l6(ArrayList var0) {
      if (var0 == null) {
         return null;
      }

      int var1 = var0.size();
      if (var1 == 0) {
         return null;
      }

      String[] var2 = new String[var1];
      var0.copyTo(com.aspose.slides.ms.System.u3.n5((Object)(var2)));
      return var2;
   }

   public boolean hasKeys() {
      return this.baseHasKeys();
   }

   public void remove(String name) {
      if (this.isReadOnly()) {
         throw new NotSupportedException("Collection is read-only");
      }

      this.invalidateCachedArrays();
      this.baseRemove(name);
   }

   public void set(String name, String value) {
      if (this.isReadOnly()) {
         throw new NotSupportedException("Collection is read-only");
      }

      this.invalidateCachedArrays();
      ArrayList var3 = new ArrayList();
      if (value != null) {
         var3.addItem(value);
         this.baseSet(name, var3);
      } else {
         this.baseSet(name, null);
      }
   }

   protected void invalidateCachedArrays() {
      this.n5 = null;
      this.l6 = null;
   }
}
