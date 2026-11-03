package com.aspose.slides.Collections.ObjectModel;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$KeyCollection$Enumerator;
import com.aspose.slides.Collections.Generic.EqualityComparer$DefaultComparer;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEqualityComparer;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.KeyNotFoundException;
import com.aspose.slides.ms.System.j3;

@j3
public abstract class KeyedCollection<TKey, TItem> extends Collection<TItem> {
   private Dictionary<TKey, TItem> n5;
   private IGenericEqualityComparer<TKey> l6;
   private int k5;

   protected KeyedCollection() {
      this(null, 0);
   }

   protected KeyedCollection(IGenericEqualityComparer<TKey> comparer) {
      this(comparer, 0);
   }

   protected KeyedCollection(IGenericEqualityComparer<TKey> comparer, int dictionaryCreationThreshold) {
      if (comparer != null) {
         this.l6 = comparer;
      } else {
         this.l6 = new EqualityComparer$DefaultComparer<>();
      }

      this.k5 = dictionaryCreationThreshold;
      if (dictionaryCreationThreshold == 0) {
         this.n5 = new Dictionary<>(this.l6);
      }
   }

   public boolean containsKey(TKey key) {
      return this.n5 != null ? this.n5.containsKey(key) : this.n5(key) >= 0;
   }

   private int n5(TKey var1) {
      for (int var2 = this.size() - 1; var2 >= 0; var2--) {
         Object var3 = this.getKeyForItem((TItem)super.get_Item(var2));
         if (this.l6.equalsT((TKey)var1, (TKey)var3)) {
            return var2;
         }
      }

      return -1;
   }

   public boolean removeByKey(TKey key) {
      Object var2 = null;
      if (this.n5 != null) {
         Object[] var6 = new Object[]{var2};
         boolean var4 = this.n5.tryGetValue(key, var6);
         var2 = var6[0];
         return var4 ? super.removeItem((TItem)var2) : false;
      }

      int var3 = this.n5(key);
      if (var3 == -1) {
         return false;
      }

      this.removeAt(var3);
      return true;
   }

   public IGenericEqualityComparer<TKey> getComparer() {
      return this.l6;
   }

   @Override
   public TItem get_Item(int index) {
      if (this.n5 != null && this.n5.getKeys().size() > 0) {
         Dictionary$KeyCollection$Enumerator var2 = this.n5.getKeys().iterator();
         return (TItem)(var2.hasNext() && var2.next() instanceof Integer ? this.get_Item((TKey)Integer.valueOf(index)) : super.get_Item(index));
      } else {
         return (TItem)super.get_Item(index);
      }
   }

   public TItem get_Item(TKey key) {
      if (this.n5 != null) {
         return this.n5.get_Item(key);
      } else {
         int var2 = this.n5(key);
         if (var2 >= 0) {
            return (TItem)super.get_Item(var2);
         } else {
            throw new KeyNotFoundException();
         }
      }
   }

   protected void changeItemKey(TItem item, TKey newKey) {
      if (!this.containsItem(item)) {
         throw new ArgumentException();
      }

      Object var3 = this.getKeyForItem(item);
      if (!this.l6.equalsT((TKey)var3, newKey)) {
         if (this.containsKey(newKey)) {
            throw new ArgumentException();
         }

         if (this.n5 != null) {
            if (!this.n5.removeItemByKey((TKey)var3)) {
               throw new ArgumentException();
            }

            this.n5.addItem(newKey, item);
         }
      }
   }

   @Override
   public void clear() {
      if (this.n5 != null) {
         this.n5.clear();
      }

      super.clear();
   }

   protected abstract TKey getKeyForItem(TItem var1);

   @Override
   public void insertItem(int index, TItem item) {
      Object var3 = this.getKeyForItem(item);
      if (var3 == null) {
         throw new ArgumentNullException("GetKeyForItem(item)");
      }

      if (this.n5 != null && this.n5.containsKey((TKey)var3)) {
         throw new ArgumentException("An element with the same key already exists in the dictionary.");
      }

      if (this.n5 == null) {
         for (int var4 = 0; var4 < this.size(); var4++) {
            if (this.l6.equalsT((TKey)var3, this.getKeyForItem((TItem)super.get_Item(var4)))) {
               throw new ArgumentException("An element with the same key already exists in the dictionary.");
            }
         }
      }

      super.insertItem(index, item);
      if (this.n5 != null) {
         this.n5.addItem((TKey)var3, item);
      } else if (this.k5 != -1 && this.size() > this.k5) {
         this.n5 = new Dictionary<>(this.l6);

         for (int var6 = 0; var6 < this.size(); var6++) {
            Object var5 = super.get_Item(var6);
            this.n5.addItem(this.getKeyForItem((TItem)var5), (TItem)var5);
         }
      }
   }

   @Override
   public void removeAt(int index) {
      if (this.n5 != null) {
         Object var2 = this.getKeyForItem((TItem)super.get_Item(index));
         this.n5.removeItemByKey((TKey)var2);
      }

      super.removeAt(index);
   }

   @Override
   public void setItem(int index, TItem item) {
      if (this.n5 != null) {
         this.n5.removeItemByKey(this.getKeyForItem((TItem)super.get_Item(index)));
         this.n5.addItem(this.getKeyForItem(item), item);
      }

      super.setItem(index, item);
   }

   protected IGenericDictionary<TKey, TItem> getDictionary() {
      return this.n5;
   }
}
