package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

public final class CommentAuthorCollection extends DomObject<Presentation> implements ICommentAuthorCollection {
   private long k5;
   List<ICommentAuthor> n5 = new List<>();
   CommentAuthor l6;

   CommentAuthorCollection(Presentation parentImmediate) {
      super(parentImmediate);
   }

   @Override
   public final int size() {
      return this.n5.size();
   }

   @Override
   public final ICommentAuthor get_Item(int index) {
      return this.n5.get_Item(index);
   }

   @Override
   public final ICommentAuthor addAuthor(String name, String initials) {
      synchronized (this.n5.getSyncRoot()) {
         List$Enumerator var4 = this.n5.iterator();

         try {
            while (var4.hasNext()) {
               CommentAuthor var5 = (CommentAuthor)var4.next();
               if (com.aspose.slides.ms.System.d1.a6(var5.getName(), name) && com.aspose.slides.ms.System.d1.a6(var5.getInitials(), initials)) {
                  throw new PptxEditException(com.aspose.slides.ms.System.d1.n5("The author with name '{0}' and initials '{1}' already added",new Object[]{ name, initials}));
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }

         List$Enumerator var21 = this.n5.iterator();

         try {
            while (var21.hasNext()) {
               CommentAuthor var6 = (CommentAuthor)var21.next();
               this.k5 = (var6.u3() & 4294967295L) >= (this.k5 & 4294967295L) ? (var6.u3() & 4294967295L) + 1L & 4294967295L : this.k5;
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var21, IDisposable.class)) {
               var21.dispose();
            }
         }

         long var8 = this.k5++;
         CommentAuthor var10 = new CommentAuthor(this, var8, name, initials);
         this.n5.addItem(var10);
         return var10;
      }
   }

   @Override
   public final ICommentAuthor[] toArray() {
      return (ICommentAuthor[])this.n5.toArray(new ICommentAuthor[0]);
   }

   @Override
   public final ICommentAuthor[] findByName(String name) {
      List var2 = new List();
      List$Enumerator var3 = this.n5.iterator();

      try {
         while (var3.hasNext()) {
            ICommentAuthor var4 = (ICommentAuthor)var3.next();
            if (com.aspose.slides.ms.System.d1.a6(var4.getName(), name)) {
               var2.addItem(var4);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return (ICommentAuthor[])var2.toArray(new ICommentAuthor[0]);
   }

   @Override
   public final ICommentAuthor[] findByNameAndInitials(String name, String initials) {
      List var3 = new List();
      List$Enumerator var4 = this.n5.iterator();

      try {
         while (var4.hasNext()) {
            ICommentAuthor var5 = (ICommentAuthor)var4.next();
            if (com.aspose.slides.ms.System.d1.a6(var5.getName(), name) && com.aspose.slides.ms.System.d1.a6(var5.getInitials(), initials)) {
               var3.addItem(var5);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      return (ICommentAuthor[])var3.toArray(new ICommentAuthor[0]);
   }

   @Override
   public final void removeAt(int index) {
      this.get_Item(index).remove();
   }

   @Override
   public final void remove(ICommentAuthor author) {
      if (author == null) {
         throw new ArgumentNullException();
      }

      author.remove();
   }

   @Override
   public final void clear() {
      ICommentAuthor[] var1 = this.toArray();

      for (ICommentAuthor var5 : var1) {
         var5.remove();
      }
   }

   final boolean n5(ICommentAuthor var1) {
      return this.n5.removeItem(var1);
   }

   @Override
   public final IGenericEnumerator<ICommentAuthor> iterator() {
      return this.n5.iterator();
   }

   @Override
   public final IGenericEnumerator<ICommentAuthor> iteratorJava() {
      return this.n5.iteratorJava();
   }

   final CommentAuthor n5(int var1) {
      List$Enumerator var2 = this.n5.iterator();

      try {
         while (var2.hasNext()) {
            CommentAuthor var3 = (CommentAuthor)var2.next();
            if ((var3.u3() & 4294967295L) == var1) {
               return var3;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return null;
   }

   final int n5() {
      return this.n5.size() - this.l6();
   }

   final int l6() {
      int var1 = 0;
      List$Enumerator var2 = this.n5.iterator();

      try {
         while (var2.hasNext()) {
            CommentAuthor var3 = (CommentAuthor)var2.next();
            if (var3.n5() > 0) {
               var1++;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1;
   }

   final CommentAuthor n5(com.aspose.slides.ms.System.o0 var1) {
      List$Enumerator var2 = this.n5.iterator();

      try {
         while (var2.hasNext()) {
            CommentAuthor var3 = (CommentAuthor)var2.next();
            if (com.aspose.slides.ms.System.o0.n5(var3.k5().n5(), var1)) {
               return var3;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return this.k5();
   }

   private CommentAuthor k5() {
      if (this.l6 == null) {
         this.l6 = new CommentAuthor(this, 0L, "Unknown User", "");
      }

      return this.l6;
   }

   @Override
   public final void copyTo(com.aspose.slides.ms.System.u3 array, int index) {
      this.n5.copyTo(array, index);
   }

   @Override
   public final boolean isSynchronized() {
      return false;
   }

   @Override
   public final Object getSyncRoot() {
      return this;
   }
}
