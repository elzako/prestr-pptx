package com.aspose.slides.Collections;

import com.aspose.slides.Collections.Generic.IGenericEqualityComparer;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.SerializationException;
import com.aspose.slides.internal.h3d.c4;
import com.aspose.slides.internal.h3d.h0;
import com.aspose.slides.internal.h3d.s3;
import com.aspose.slides.internal.h3d.s7;
import com.aspose.slides.internal.h3d.y2;
import com.aspose.slides.internal.r5t.t2;
import com.aspose.slides.internal.t3o.l6;
import com.aspose.slides.internal.t3o.n5;
import com.aspose.slides.internal.v6g.k5;
import com.aspose.slides.internal.v6g.u9;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.u3;
import com.aspose.slides.ms.System.v4;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.AbstractMap.SimpleEntry;
import java.util.Map.Entry;

@j3
public class Hashtable implements ICollection, IDictionary, IEnumerable, h0, s7, v4, Map {
   private IGenericEqualityComparer n5;
   private final Object l6 = new Object();
   private Hashtable$Bucket[] k5;
   private int u3;
   private volatile boolean a6;
   private ICollection u9;
   private float h0;
   private int c8;
   private c4 t2;
   private int s7;
   private ICollection x8;
   private volatile int n3;
   private static final u9 y4 = new u9("LoadFactor", "HashSize", "KeyComparer", "Comparer", "HashCodeProvider", "Keys", "Values");

   public Hashtable() {
      this(0, 1.0F);
   }

   Hashtable(boolean trash) {
   }

   public Hashtable(IDictionary d) {
      this(d, 1.0F);
   }

   public Hashtable(IGenericEqualityComparer equalityComparer) {
      this(0, 1.0F, equalityComparer);
   }

   public Hashtable(int capacity) {
      this(capacity, 1.0F);
   }

   public Hashtable(IDictionary d, IGenericEqualityComparer equalityComparer) {
      this(d, 1.0F, equalityComparer);
   }

   public Hashtable(IDictionary d, float loadFactor) {
      this(d, loadFactor, (IGenericEqualityComparer)null);
   }

   @Deprecated
   public Hashtable(IHashCodeProvider hcp, Comparator comparer) {
      this(0, 1.0F, hcp, comparer);
   }

   public Hashtable(int capacity, IGenericEqualityComparer equalityComparer) {
      this(capacity, 1.0F, equalityComparer);
   }

   public Hashtable(int capacity, float loadFactor) {
      if (capacity < 0) {
         throw new ArgumentOutOfRangeException("capacity", "Non-negative number required");
      }

      if (!(loadFactor < 0.1F) && !(loadFactor > 1.0F) && !Float.isNaN(loadFactor)) {
         this.h0 = 0.72F * loadFactor;
         double var3 = capacity / this.h0;
         if (var3 > 2.147483647E9) {
            throw new ArgumentException("Hashtable's capacity overflowed and went negative. Check load factor, capacity and the current size of the table");
         }

         int var5 = var3 > 11.0 ? com.aspose.slides.internal.t3o.n5.n5((int)var3) : 11;
         this.k5 = this.l6(var5);
         this.c8 = (int)(this.h0 * var5);
         this.a6 = false;
      } else {
         throw new ArgumentOutOfRangeException("loadFactor", d1.n5("Load factor needs to be between {0} and {1}", 0.1, 1.0));
      }
   }

   protected Hashtable(c4 info, s3 context) {
      this.t2 = info;
   }

   @Deprecated
   public Hashtable(IDictionary d, IHashCodeProvider hcp, Comparator comparer) {
      this(d, 1.0F, hcp, comparer);
   }

   public Hashtable(IDictionary d, float loadFactor, IGenericEqualityComparer equalityComparer) {
      this(d != null ? d.size() : 0, loadFactor, equalityComparer);
      if (d == null) {
         throw new ArgumentNullException("d", "Dictionary cannot be null");
      }

      IDictionaryEnumerator var4 = d.iterator();

      while (var4.hasNext()) {
         this.addItem(var4.getKey(), var4.getValue());
      }
   }

   @Deprecated
   public Hashtable(int capacity, IHashCodeProvider hcp, Comparator comparer) {
      this(capacity, 1.0F, hcp, comparer);
   }

   public Hashtable(int capacity, float loadFactor, IGenericEqualityComparer equalityComparer) {
      this(capacity, loadFactor);
      this.n5 = equalityComparer;
   }

   @Deprecated
   public Hashtable(IDictionary d, float loadFactor, IHashCodeProvider hcp, Comparator comparer) {
      this(d != null ? d.size() : 0, loadFactor, hcp, comparer);
      if (d == null) {
         throw new ArgumentNullException("d", "Dictionary cannot be null");
      }

      IDictionaryEnumerator var5 = d.iterator();

      while (var5.hasNext()) {
         this.addItem(var5.getKey(), var5.getValue());
      }
   }

   @Deprecated
   public Hashtable(int capacity, float loadFactor, IHashCodeProvider hcp, Comparator comparer) {
      this(capacity, loadFactor);
      if (hcp == null && comparer == null) {
         this.n5 = null;
      } else {
         this.n5 = new Hashtable$CompatibleComparer(comparer, hcp);
      }
   }

   @Override
   public void addItem(Object key, Object value) {
      this.n5(key, value, true);
   }

   @Override
   public void clear() {
      if (this.u3 != 0) {
         this.a6 = true;

         for (int var1 = 0; var1 < this.k5.length; var1++) {
            this.k5[var1].k5 = 0;
            this.k5[var1].n5 = null;
            this.k5[var1].l6 = null;
         }

         this.u3 = 0;
         this.s7 = 0;
         this.u3();
         this.a6 = false;
      }
   }

   @Override
   public Object deepClone() {
      Hashtable$Bucket[] var1 = this.k5;
      Hashtable var2 = new Hashtable(this.u3, this.n5);
      var2.n3 = this.n3;
      var2.h0 = this.h0;
      var2.u3 = 0;
      int var3 = this.k5.length;

      while (var3 > 0) {
         Object var4 = var1[--var3].n5;
         if (var4 != null && var4 != var1) {
            var2.set_Item(var4, var1[var3].l6);
         }
      }

      return var2;
   }

   @Override
   public boolean contains(Object key) {
      return this.containsKey(key);
   }

   @Override
   public boolean containsKey(Object key) {
      long var2 = 0L;
      long var4 = 0L;
      Hashtable$Bucket var6 = new Hashtable$Bucket();
      if (key == null) {
         throw new ArgumentNullException("key", "Key cannot be null");
      }

      Hashtable$Bucket[] var7 = this.k5;
      long[] var8 = new long[]{0L};
      long[] var9 = new long[]{0L};
      long var10 = this.n5(key, this.k5.length, var8, var9);
      var2 = var8[0];
      var4 = var9[0];
      int var12 = 0;
      int var13 = (int)((var2 & 4294967295L) % this.k5.length);

      while (true) {
         var7[var13].n5(var6);
         if (var6.n5 == null) {
            return false;
         }

         if ((var6.k5 & 2147483647) == (var10 & 4294967295L) && this.keyEquals(var6.n5, key)) {
            return true;
         }

         var13 = (int)((var13 + (var4 & 4294967295L)) % this.k5.length);
         if (var6.k5 < 0) {
            if (++var12 < this.k5.length) {
               continue;
            }
         }

         return false;
      }
   }

   @Override
   public boolean containsValue(Object value) {
      if (value == null) {
         int var2 = this.k5.length;

         while (--var2 >= 0) {
            if (this.k5[var2].n5 != null && this.k5[var2].n5 != this.k5 && this.k5[var2].l6 == null) {
               return true;
            }
         }
      } else {
         int var4 = this.k5.length;

         while (--var4 >= 0) {
            Object var3 = this.k5[var4].l6;
            if (var3 != null && var3.equals(value)) {
               return true;
            }
         }
      }

      return false;
   }

   private void k5(u3 var1, int var2) {
      Hashtable$Bucket[] var3 = this.k5;
      int var4 = this.k5.length;

      while (--var4 >= 0) {
         Object var5 = var3[var4].n5;
         if (var5 != null && var5 != this.k5) {
            DictionaryEntry var6 = new DictionaryEntry(var5, var3[var4].l6);
            var1.k5(var6.Clone(), var2++);
         }
      }
   }

   void n5(u3 var1, int var2) {
      Hashtable$Bucket[] var3 = this.k5;
      int var4 = this.k5.length;

      while (--var4 >= 0) {
         Object var5 = var3[var4].n5;
         if (var5 != null && var5 != this.k5) {
            var1.k5(var5, var2++);
         }
      }
   }

   @Override
   public void copyTo(u3 array, int arrayIndex) {
      if (array == null) {
         throw new ArgumentNullException("array", "Array cannot be null");
      }

      if (array.u3() != 1) {
         throw new ArgumentException("Only single dimensional arrays are supported for the requested action");
      }

      if (arrayIndex < 0) {
         throw new ArgumentOutOfRangeException("arrayIndex", "Non-negative number required");
      }

      if (array.a6() - arrayIndex < this.u3) {
         throw new ArgumentException("Destination array is not long enough to copy all the items in the collection. Check array index and length");
      }

      this.k5(array, arrayIndex);
   }

   void l6(u3 var1, int var2) {
      Hashtable$Bucket[] var3 = this.k5;
      int var4 = this.k5.length;

      while (--var4 >= 0) {
         Object var5 = var3[var4].n5;
         if (var5 != null && var5 != this.k5) {
            var1.k5(var3[var4].l6, var2++);
         }
      }
   }

   private void l6() {
      int var1 = com.aspose.slides.internal.t3o.n5.n5(this.k5.length * 2);
      this.n5(var1);
   }

   @Override
   public IDictionaryEnumerator iterator() {
      return new Hashtable$HashtableEnumerator(this, 3);
   }

   protected int getHash(Object key) {
      return this.n5 != null ? this.n5.hashCode(key) : key.hashCode();
   }

   @Override
   public void getObjectData(c4 info, s3 context) {
      if (info == null) {
         throw new ArgumentNullException("info");
      }

      info.n5("LoadFactor", this.h0);
      info.n5("Version", this.n3);
      if (this.n5 == null) {
         info.n5("Comparer", null, com.aspose.slides.internal.v6g.k5.n5(Comparator.class));
         info.n5("HashCodeProvider", null, com.aspose.slides.internal.v6g.k5.n5(IHashCodeProvider.class));
      } else if (this.n5 instanceof Hashtable$CompatibleComparer) {
         Hashtable$CompatibleComparer var3 = com.aspose.slides.internal.v6g.k5.n5(this.n5, Hashtable$CompatibleComparer.class);
         info.n5("Comparer", var3.n5(), com.aspose.slides.internal.v6g.k5.n5(Comparator.class));
         info.n5("HashCodeProvider", var3.l6(), com.aspose.slides.internal.v6g.k5.n5(IHashCodeProvider.class));
      } else {
         info.n5("KeyComparer", this.n5, com.aspose.slides.internal.v6g.k5.n5(IGenericEqualityComparer.class));
      }

      info.n5("HashSize", this.k5.length);
      Object[] var5 = new Object[this.u3];
      Object[] var4 = new Object[this.u3];
      this.n5(com.aspose.slides.ms.System.u3.n5((Object)(var5)), 0);
      this.l6(com.aspose.slides.ms.System.u3.n5((Object)(var4)), 0);
      info.n5("Keys", var5, com.aspose.slides.internal.v6g.k5.n5(Object[].class));
      info.n5("Values", var4, com.aspose.slides.internal.v6g.k5.n5(Object[].class));
   }

   private long n5(Object var1, int var2, long[] var3, long[] var4) {
      long var5 = this.getHash(var1) & 2147483647;
      var3[0] = var5;
      var4[0] = 1L + (((var3[0] & 4294967295L) >> 5) + 1L) % (var2 - 1);
      return var5;
   }

   private void n5(Object var1, Object var2, boolean var3) {
      long var4 = 0L;
      long var6 = 0L;
      if (var1 == null) {
         throw new ArgumentNullException("key", "Key cannot be null");
      }

      if (this.u3 >= this.c8) {
         this.l6();
      } else if (this.s7 > this.c8 && this.u3 > 100) {
         this.k5();
      }

      long[] var8 = new long[]{0L};
      long[] var9 = new long[]{0L};
      long var10 = this.n5(var1, this.k5.length, var8, var9);
      var4 = var8[0];
      var6 = var9[0];
      int var12 = 0;
      int var13 = -1;
      int var14 = (int)((var4 & 4294967295L) % this.k5.length);

      while (true) {
         if (var13 == -1 && this.k5[var14].n5 == this.k5 && this.k5[var14].k5 < 0) {
            var13 = var14;
         }

         if (this.k5[var14].n5 != null && (this.k5[var14].n5 != this.k5 || (this.k5[var14].k5 & 2147483648L) != 0L)) {
            if ((this.k5[var14].k5 & 2147483647) == (var10 & 4294967295L) && this.keyEquals(this.k5[var14].n5, var1)) {
               if (var3) {
                  throw new ArgumentException(d1.n5("Item has already been added. Key in dictionary: '{0}'  Key being added: '{1}'", this.k5[var14].n5, var1));
               }

               this.a6 = true;
               this.k5[var14].l6 = var2;
               this.u3();
               this.a6 = false;
               break;
            }

            if (var13 == -1 && this.k5[var14].k5 >= 0) {
               this.k5[var14].k5 = (int)(this.k5[var14].k5 | -2147483648L);
               this.s7++;
            }

            var14 = (int)((var14 + (var6 & 4294967295L)) % this.k5.length);
            if (++var12 < this.k5.length) {
               continue;
            }

            if (var13 == -1) {
               throw new InvalidOperationException("Hashtable insert failed. Load factor too high.");
            }

            this.a6 = true;
            this.k5[var13].l6 = var2;
            this.k5[var13].n5 = var1;
            this.k5[var13].k5 |= (int)(var10 & 4294967295L);
            this.u3++;
            this.u3();
            this.a6 = false;
            break;
         }

         if (var13 != -1) {
            var14 = var13;
         }

         this.a6 = true;
         this.k5[var14].l6 = var2;
         this.k5[var14].n5 = var1;
         this.k5[var14].k5 |= (int)(var10 & 4294967295L);
         this.u3++;
         this.u3();
         this.a6 = false;
         break;
      }
   }

   protected boolean keyEquals(Object item, Object key) {
      if (j8.l6(this.k5, item)) {
         return false;
      } else {
         return this.n5 != null ? this.n5.equals(item, key) : item != null && item.equals(key);
      }
   }

   @Override
   public void onDeserialization(Object sender) {
      if (this.k5 == null) {
         if (this.t2 == null) {
            throw new SerializationException("OnDeserialization method was called while the object was not being deserialized.");
         }

         int var2 = 0;
         Comparator var3 = null;
         IHashCodeProvider var4 = null;
         Object[] var5 = null;
         Object[] var6 = null;
         y2 var7 = this.t2.u3();

         while (var7.hasNext()) {
            switch (y4.n5(var7.l6())) {
               case 0:
                  this.h0 = this.t2.l6("LoadFactor");
                  break;
               case 1:
                  var2 = this.t2.n5("HashSize");
                  break;
               case 2:
                  this.n5 = (IGenericEqualityComparer)this.t2.n5("KeyComparer", com.aspose.slides.internal.v6g.k5.n5(IGenericEqualityComparer.class));
                  break;
               case 3:
                  var3 = (Comparator)this.t2.n5("Comparer", com.aspose.slides.internal.v6g.k5.n5(Comparator.class));
                  break;
               case 4:
                  var4 = (IHashCodeProvider)this.t2.n5("HashCodeProvider", com.aspose.slides.internal.v6g.k5.n5(IHashCodeProvider.class));
                  break;
               case 5:
                  var5 = (Object[])this.t2.n5("Keys", com.aspose.slides.internal.v6g.k5.n5(Object[].class));
                  break;
               case 6:
                  var6 = (Object[])this.t2.n5("Values", com.aspose.slides.internal.v6g.k5.n5(Object[].class));
            }
         }

         this.c8 = (int)(this.h0 * var2);
         if (this.n5 == null && (var3 != null || var4 != null)) {
            this.n5 = new Hashtable$CompatibleComparer(var3, var4);
         }

         this.k5 = this.l6(var2);
         if (var5 == null) {
            throw new SerializationException("The Keys for this dictionary are missing");
         }

         if (var6 == null) {
            throw new SerializationException("The Values for this dictionary are missing");
         }

         if (var5.length != var6.length) {
            throw new SerializationException("The keys and values arrays have different sizes");
         }

         for (int var8 = 0; var8 < var5.length; var8++) {
            if (var5[var8] == null) {
               throw new SerializationException("One of the serialized keys is null");
            }

            this.n5(var5[var8], var6[var8], true);
         }

         this.n3 = this.t2.n5("Version");
         this.t2 = null;
      }
   }

   private void n5(Hashtable$Bucket[] var1, Object var2, Object var3, int var4) {
      long var5 = 1L + (((var4 & 4294967295L) >> 5) + 1L) % (var1.length - 1);

      int var7;
      for (var7 = (int)((var4 & 4294967295L) % var1.length);
         var1[var7].n5 != null && var1[var7].n5 != this.k5;
         var7 = (int)((var7 + (var5 & 4294967295L)) % var1.length)
      ) {
         if (var1[var7].k5 >= 0) {
            var1[var7].k5 = (int)(var1[var7].k5 | -2147483648L);
            this.s7++;
         }
      }

      var1[var7].l6 = var3;
      var1[var7].n5 = var2;
      var1[var7].k5 |= var4;
   }

   private void k5() {
      this.n5(this.k5.length);
   }

   private void n5(int var1) {
      this.s7 = 0;
      Hashtable$Bucket[] var2 = this.l6(var1);

      for (int var3 = 0; var3 < this.k5.length; var3++) {
         Hashtable$Bucket var4 = this.k5[var3].n5();
         if (var4.n5 != null && var4.n5 != this.k5) {
            this.n5(var2, var4.n5, var4.l6, var4.k5 & 2147483647);
         }
      }

      this.a6 = true;
      this.k5 = var2;
      this.c8 = (int)(this.h0 * var1);
      this.u3();
      this.a6 = false;
   }

   @Override
   public void removeItem(Object key) {
      long var2 = 0L;
      long var4 = 0L;
      Hashtable$Bucket var6 = new Hashtable$Bucket();
      if (key == null) {
         throw new ArgumentNullException("key", "Key cannot be null");
      }

      long[] var7 = new long[]{0L};
      long[] var8 = new long[]{0L};
      long var9 = this.n5(key, this.k5.length, var7, var8);
      var2 = var7[0];
      var4 = var8[0];
      int var11 = 0;
      int var12 = (int)((var2 & 4294967295L) % this.k5.length);

      do {
         this.k5[var12].n5(var6);
         if ((var6.k5 & 2147483647) == (var9 & 4294967295L) && this.keyEquals(var6.n5, key)) {
            this.a6 = true;
            this.k5[var12].k5 = (int)(this.k5[var12].k5 & -2147483648L);
            if (this.k5[var12].k5 != 0) {
               this.k5[var12].n5 = this.k5;
            } else {
               this.k5[var12].n5 = null;
            }

            this.k5[var12].l6 = null;
            this.u3--;
            this.u3();
            this.a6 = false;
            break;
         }

         var12 = (int)((var12 + (var4 & 4294967295L)) % this.k5.length);
      } while (var6.k5 < 0 && ++var11 < this.k5.length);
   }

   public static Hashtable sync(Hashtable table) {
      if (table == null) {
         throw new ArgumentNullException("table");
      } else {
         return new Hashtable$SyncHashtable(table);
      }
   }

   Hashtable$KeyValuePairs[] n5() {
      Hashtable$KeyValuePairs[] var1 = new Hashtable$KeyValuePairs[this.u3];
      int var2 = 0;
      Hashtable$Bucket[] var3 = this.k5;
      int var4 = this.k5.length;

      while (--var4 >= 0) {
         Object var5 = var3[var4].n5;
         if (var5 != null && var5 != this.k5) {
            var1[var2++] = new Hashtable$KeyValuePairs(var5, var3[var4].l6);
         }
      }

      return var1;
   }

   private void u3() {
      this.n3++;
   }

   private Hashtable$Bucket[] l6(int var1) {
      Hashtable$Bucket[] var2 = new Hashtable$Bucket[var1];

      for (int var3 = 0; var3 < var2.length; var3++) {
         var2[var3] = new Hashtable$Bucket();
      }

      return var2;
   }

   @Override
   public int size() {
      return this.u3;
   }

   protected IGenericEqualityComparer getEqualityComparer() {
      return this.n5;
   }

   @Override
   public boolean isFixedSize() {
      return false;
   }

   @Override
   public boolean isReadOnly() {
      return false;
   }

   @Override
   public boolean isSynchronized() {
      return false;
   }

   @Override
   public Object get_Item(Object key) {
      long var2 = 0L;
      long var4 = 0L;
      Hashtable$Bucket var6 = new Hashtable$Bucket();
      if (key == null) {
         throw new ArgumentNullException("key", "Key cannot be null");
      }

      Hashtable$Bucket[] var7 = this.k5;
      long[] var8 = new long[]{0L};
      long[] var9 = new long[]{0L};
      long var10 = this.n5(key, this.k5.length, var8, var9);
      var2 = var8[0];
      var4 = var9[0];
      int var12 = 0;
      int var13 = (int)((var2 & 4294967295L) % this.k5.length);

      do {
         int var14 = 0;

         int var15;
         do {
            var15 = this.n3;
            var7[var13].n5(var6);
            if (++var14 % 8 == 0) {
               com.aspose.slides.internal.r5t.t2.l6(1);
            }
         } while (this.a6 || var15 != this.n3);

         if (var6.n5 == null) {
            break;
         }

         if ((var6.k5 & 2147483647) == (var10 & 4294967295L) && this.keyEquals(var6.n5, key)) {
            return var6.l6;
         }

         var13 = (int)((var13 + (var4 & 4294967295L)) % this.k5.length);
      } while (var6.k5 < 0 && ++var12 < this.k5.length);

      return null;
   }

   @Override
   public void set_Item(Object key, Object value) {
      this.n5(key, value, false);
   }

   @Override
   public ICollection getKeys() {
      if (this.u9 == null) {
         this.u9 = new Hashtable$KeyCollection(this);
      }

      return this.u9;
   }

   @Override
   public Object getSyncRoot() {
      return this.l6;
   }

   @Override
   public ICollection getValues() {
      if (this.x8 == null) {
         this.x8 = new Hashtable$ValueCollection(this);
      }

      return this.x8;
   }

   @Override
   public boolean isEmpty() {
      return this.u3 == 0;
   }

   @Override
   public Object get(Object key) {
      return this.get_Item(key);
   }

   @Override
   public Object put(Object key, Object value) {
      Object var3 = this.get_Item(key);
      this.set_Item(key, value);
      return var3;
   }

   @Override
   public Object remove(Object key) {
      Object var2 = this.get_Item(key);
      this.removeItem(key);
      return var2;
   }

   @Override
   public void putAll(Map m) {
      for (Object var4 : m.keySet()) {
         Object var5 = m.get(var4);
         this.put(var4, var5);
      }
   }

   @Override
   public Set keySet() {
      Object[] var1 = new Object[this.size()];
      u3 var2 = com.aspose.slides.ms.System.u3.n5((Object)(var1));
      this.getKeys().copyTo(var2, 0);
      return new Hashtable$ReadOnlyItemCollection(this, var2);
   }

   @Override
   public Collection values() {
      Object[] var1 = new Object[this.size()];
      u3 var2 = com.aspose.slides.ms.System.u3.n5((Object)(var1));
      this.getValues().copyTo(var2, 0);
      return new Hashtable$ReadOnlyItemCollection(this, var2);
   }

   @Override
   public Set entrySet() {
      Hashtable$KeyValuePairs[] var1 = this.n5();
      Entry[] var2 = new Entry[var1.length];

      for (int var3 = 0; var3 < var2.length; var3++) {
         var2[var3] = new SimpleEntry<>(var1[var3].n5(), var1[var3].l6());
      }

      return new Hashtable$ReadOnlyItemCollection(this, com.aspose.slides.ms.System.u3.n5((Object)(var2)));
   }

   public int getVersion() {
      return this.n3;
   }

   public static Hashtable fromJava(Map map) {
      return map == null ? null : new l6(map);
   }

   public static Map toJava(Hashtable h) {
      return h;
   }

   // $VF: synthetic method
   static Hashtable$Bucket[] n5(Hashtable var0) {
      return var0.k5;
   }

   // $VF: synthetic method
   static int l6(Hashtable var0) {
      return var0.n3;
   }
}
