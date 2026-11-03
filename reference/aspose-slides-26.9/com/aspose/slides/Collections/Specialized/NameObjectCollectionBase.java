package com.aspose.slides.Collections.Specialized;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.CaseInsensitiveComparer;
import com.aspose.slides.Collections.CaseInsensitiveHashCodeProvider;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.IHashCodeProvider;
import com.aspose.slides.Collections.Generic.IGenericEqualityComparer;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.p6;
import com.aspose.slides.ms.System.u3;
import com.aspose.slides.ms.System.y8;
import java.util.Comparator;

@j3
public abstract class NameObjectCollectionBase implements ICollection, IEnumerable {
   private Hashtable n5;
   private NameObjectCollectionBase$_Item l6;
   private ArrayList k5;
   private IHashCodeProvider u3;
   private Comparator a6;
   private int u9;
   private boolean h0;
   private NameObjectCollectionBase$KeysCollection c8;
   private IGenericEqualityComparer t2;

   IGenericEqualityComparer n5() {
      return this.t2;
   }

   Comparator l6() {
      return this.a6;
   }

   IHashCodeProvider k5() {
      return this.u3;
   }

   protected NameObjectCollectionBase() {
      this.h0 = false;
      this.u3 = CaseInsensitiveHashCodeProvider.getDefaultInvariant();
      this.a6 = CaseInsensitiveComparer.getDefaultInvariant();
      this.u9 = 0;
      this.u3();
   }

   protected NameObjectCollectionBase(int capacity) {
      this.h0 = false;
      this.u3 = CaseInsensitiveHashCodeProvider.getDefaultInvariant();
      this.a6 = CaseInsensitiveComparer.getDefaultInvariant();
      this.u9 = capacity;
      this.u3();
   }

   NameObjectCollectionBase(IGenericEqualityComparer equalityComparer, Comparator comparer, IHashCodeProvider hcp) {
      this.t2 = equalityComparer;
      this.a6 = comparer;
      this.u3 = hcp;
      this.h0 = false;
      this.u9 = 0;
      this.u3();
   }

   protected NameObjectCollectionBase(IGenericEqualityComparer equalityComparer) {
      this(equalityComparer == null ? p6.l6() : equalityComparer, null, null);
   }

   @Deprecated
   protected NameObjectCollectionBase(IHashCodeProvider hashProvider, Comparator comparer) {
      this.a6 = comparer;
      this.u3 = hashProvider;
      this.h0 = false;
      this.u9 = 0;
      this.u3();
   }

   protected NameObjectCollectionBase(int capacity, IGenericEqualityComparer equalityComparer) {
      this.h0 = false;
      this.t2 = equalityComparer == null ? p6.l6() : equalityComparer;
      this.u9 = capacity;
      this.u3();
   }

   @Deprecated
   protected NameObjectCollectionBase(int capacity, IHashCodeProvider hashProvider, Comparator comparer) {
      this.h0 = false;
      this.u3 = hashProvider;
      this.a6 = comparer;
      this.u9 = capacity;
      this.u3();
   }

   private void u3() {
      if (this.n5 != null) {
         this.n5.clear();
         this.n5 = null;
      }

      if (this.k5 != null) {
         this.k5.clear();
         this.k5 = null;
      }

      if (this.t2 != null) {
         this.n5 = new Hashtable(this.u9, this.t2);
      } else {
         this.n5 = new Hashtable(this.u9, this.u3, this.a6);
      }

      this.k5 = new ArrayList();
      this.l6 = null;
   }

   public NameObjectCollectionBase$KeysCollection getKeys() {
      if (this.c8 == null) {
         this.c8 = new NameObjectCollectionBase$KeysCollection(this);
      }

      return this.c8;
   }

   @Override
   public IEnumerator iterator() {
      return new NameObjectCollectionBase$_KeysEnumerator(this);
   }

   @Override
   public int size() {
      return this.k5.size();
   }

   @Override
   public boolean isSynchronized() {
      return false;
   }

   @Override
   public Object getSyncRoot() {
      return this;
   }

   @Override
   public void copyTo(u3 array, int index) {
      this.getKeys().copyTo(array, index);
   }

   protected boolean isReadOnly() {
      return this.h0;
   }

   protected void isReadOnly(boolean value) {
      this.h0 = value;
   }

   protected void baseAdd(String name, Object value) {
      if (this.isReadOnly()) {
         throw new NotSupportedException("Collection is read-only");
      }

      NameObjectCollectionBase$_Item var3 = new NameObjectCollectionBase$_Item(name, value);
      if (name == null) {
         if (this.l6 == null) {
            this.l6 = var3;
         }
      } else if (this.n5.get_Item(name) == null) {
         this.n5.addItem(name, var3);
      }

      this.k5.addItem(var3);
   }

   protected void baseClear() {
      if (this.isReadOnly()) {
         throw new NotSupportedException("Collection is read-only");
      }

      this.u3();
   }

   protected Object baseGet(int index) {
      return ((NameObjectCollectionBase$_Item)this.k5.get_Item(index)).l6;
   }

   protected Object baseGet(String name) {
      NameObjectCollectionBase$_Item var2 = this.n5(name);
      return var2 == null ? null : var2.l6;
   }

   protected String[] baseGetAllKeys() {
      int var1 = this.k5.size();
      String[] var2 = new String[var1];

      for (int var3 = 0; var3 < var1; var3++) {
         var2[var3] = this.baseGetKey(var3);
      }

      return var2;
   }

   protected Object[] baseGetAllValues() {
      int var1 = this.k5.size();
      Object[] var2 = new Object[var1];

      for (int var3 = 0; var3 < var1; var3++) {
         var2[var3] = this.baseGet(var3);
      }

      return var2;
   }

   protected Object[] baseGetAllValues(y8 type) {
      if (type == null) {
         throw new ArgumentNullException("'type' argument can't be null");
      }

      int var2 = this.k5.size();
      Object[] var3 = (Object[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(type, var2));

      for (int var4 = 0; var4 < var2; var4++) {
         var3[var4] = this.baseGet(var4);
      }

      return var3;
   }

   protected String baseGetKey(int index) {
      return ((NameObjectCollectionBase$_Item)this.k5.get_Item(index)).n5;
   }

   protected boolean baseHasKeys() {
      return this.n5.size() > 0;
   }

   protected void baseRemove(String name) {
      int var2 = 0;
      if (this.isReadOnly()) {
         throw new NotSupportedException("Collection is read-only");
      }

      if (name != null) {
         this.n5.removeItem(name);
      } else {
         this.l6 = null;
      }

      var2 = this.k5.size();
      int var3 = 0;

      while (var3 < var2) {
         String var4 = this.baseGetKey(var3);
         if (this.n5(var4, name)) {
            this.k5.removeAt(var3);
            var2--;
         } else {
            var3++;
         }
      }
   }

   protected void baseRemoveAt(int index) {
      if (this.isReadOnly()) {
         throw new NotSupportedException("Collection is read-only");
      }

      String var2 = this.baseGetKey(index);
      if (var2 != null) {
         this.n5.removeItem(var2);
      } else {
         this.l6 = null;
      }

      this.k5.removeAt(index);
   }

   protected void baseSet(int index, Object value) {
      if (this.isReadOnly()) {
         throw new NotSupportedException("Collection is read-only");
      }

      NameObjectCollectionBase$_Item var3 = (NameObjectCollectionBase$_Item)this.k5.get_Item(index);
      var3.l6 = value;
   }

   protected void baseSet(String name, Object value) {
      if (this.isReadOnly()) {
         throw new NotSupportedException("Collection is read-only");
      }

      NameObjectCollectionBase$_Item var3 = this.n5(name);
      if (var3 != null) {
         var3.l6 = value;
      } else {
         this.baseAdd(name, value);
      }
   }

   private NameObjectCollectionBase$_Item n5(String var1) {
      return var1 != null ? (NameObjectCollectionBase$_Item)this.n5.get_Item(var1) : this.l6;
   }

   boolean n5(String var1, String var2) {
      return this.a6 != null ? this.a6.compare(var1, var2) == 0 : this.t2.equals(var1, var2);
   }

   // $VF: synthetic method
   static ArrayList n5(NameObjectCollectionBase var0) {
      return var0.k5;
   }
}
