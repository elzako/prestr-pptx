package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.IDisposable;
import java.awt.geom.Point2D.Float;
import java.util.Date;

public final class CommentCollection extends DomObject<CommentAuthor> implements ICommentCollection {
   private final List<IComment> n5 = new List<>();

   @Override
   public final int size() {
      return this.n5.size();
   }

   @Override
   public final IComment get_Item(int index) {
      return this.n5.get_Item(index);
   }

   @Override
   public final IComment addComment(String text, ISlide slide, Float position, Date creationTime) {
      return this.n5(text, slide, com.aspose.slides.internal.o9b.w1.n5(position), com.aspose.slides.ms.System.j5.n5(creationTime));
   }

   IComment n5(String var1, ISlide var2, com.aspose.slides.internal.o9b.w1 var3, com.aspose.slides.ms.System.j5 var4) {
      Comment var5 = this.n5(var1, (Slide)var2, var3.u3(), var4.m3());
      this.n5.addItem(var5);
      return var5;
   }

   @Override
   public final IModernComment addModernComment(String text, ISlide slide, IShape shape, Float position, Date creationTime) {
      return this.n5(text, slide, shape, com.aspose.slides.internal.o9b.w1.n5(position), com.aspose.slides.ms.System.j5.n5(creationTime));
   }

   IModernComment n5(String var1, ISlide var2, IShape var3, com.aspose.slides.internal.o9b.w1 var4, com.aspose.slides.ms.System.j5 var5) {
      ModernComment var6 = this.n5(var1, (Slide)var2, (Shape)var3, var4.u3(), var5.m3());
      this.n5.addItem(var6);
      return var6;
   }

   @Override
   public final IComment insertComment(int index, String text, ISlide slide, Float position, Date creationTime) {
      return this.n5(index, text, slide, com.aspose.slides.internal.o9b.w1.n5(position), com.aspose.slides.ms.System.j5.n5(creationTime));
   }

   IComment n5(int var1, String var2, ISlide var3, com.aspose.slides.internal.o9b.w1 var4, com.aspose.slides.ms.System.j5 var5) {
      Comment var6 = this.n5(var2, (Slide)var3, var4.u3(), var5.m3());
      this.n5.insertItem(var1, var6);
      return var6;
   }

   @Override
   public final IModernComment insertModernComment(int index, String text, ISlide slide, IShape shape, Float position, Date creationTime) {
      return this.n5(index, text, slide, shape, com.aspose.slides.internal.o9b.w1.n5(position), com.aspose.slides.ms.System.j5.n5(creationTime));
   }

   IModernComment n5(int var1, String var2, ISlide var3, IShape var4, com.aspose.slides.internal.o9b.w1 var5, com.aspose.slides.ms.System.j5 var6) {
      ModernComment var7 = this.n5(var2, (Slide)var3, (Shape)var4, var5.u3(), var6.m3());
      this.n5.insertItem(var1, var7);
      return var7;
   }

   @Override
   public final IComment[] toArray() {
      return this.n5.toArray(new IComment[0]);
   }

   @Override
   public final IComment[] toArray(int startIndex, int count) {
      if (startIndex < 0) {
         throw new ArgumentOutOfRangeException("startIndex");
      }

      if (count >= 0 && startIndex + count <= this.size()) {
         Comment[] var3 = new Comment[count];

         for (int var4 = 0; var4 < count; var4++) {
            var3[var4] = (Comment)this.n5.get_Item(var4 + startIndex);
         }

         return var3;
      } else {
         throw new ArgumentOutOfRangeException("count");
      }
   }

   @Override
   public final void removeAt(int index) {
      this.n5.get_Item(index).remove();
   }

   @Override
   public final void remove(IComment comment) {
      if (comment == null) {
         throw new ArgumentNullException();
      }

      comment.remove();
   }

   @Override
   public final void clear() {
      for (int var1 = this.n5.size() - 1; var1 >= 0; var1--) {
         this.n5.get_Item(var1).remove();
      }
   }

   @Override
   public final IGenericEnumerator<IComment> iterator() {
      return this.n5.iterator();
   }

   @Override
   public final IGenericEnumerator<IComment> iteratorJava() {
      return this.n5.iteratorJava();
   }

   final Presentation n5() {
      return (Presentation)this.u9.a6().getPresentation();
   }

   CommentCollection(CommentAuthor parentImmediate) {
      super(parentImmediate);
   }

   final void n5(Comment var1) {
      this.n5.removeItem(var1);
   }

   final void l6() {
      this.n5.sort(new CommentCollection$1(this));
   }

   public final IComment findCommentByIdx(int idx) {
      List$Enumerator var2 = this.n5.iterator();

      try {
         while (var2.hasNext()) {
            Comment var3 = (Comment)var2.next();
            if ((var3.u3().n5() & 4294967295L) == idx) {
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

   private Comment n5(String var1, Slide var2, com.aspose.slides.internal.o9b.w1 var3, com.aspose.slides.ms.System.j5 var4) {
      if (var2 == null) {
         throw new ArgumentNullException("slide", "slide can't be null.");
      }

      if (var2.getPresentation() != this.n5()) {
         throw new PptxEditException("Can't add comment to a slide from another presentation.");
      }

      Comment var5 = new Comment(this, this.u9, var1, var2, var3.u3(), var4.m3());
      var2.n5((com.aspose.slides.IComment)(var5));
      return var5;
   }

   private ModernComment n5(String var1, Slide var2, Shape var3, com.aspose.slides.internal.o9b.w1 var4, com.aspose.slides.ms.System.j5 var5) {
      if (var2 == null) {
         throw new ArgumentNullException("slide", "slide can't be null.");
      }

      if (var2.getPresentation() != this.n5()) {
         throw new PptxEditException("Can't add comment to a slide from another presentation.");
      }

      ModernComment var6 = new ModernComment(this, this.u9, var1, var2, var3, var4.u3(), var5.m3());
      var2.n5((com.aspose.slides.IComment)(var6));
      return var6;
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

   private static int l6(IComment var0, IComment var1) {
      return com.aspose.slides.ms.System.j5.a6(((Comment)var0).n5().m3(), ((Comment)var1).n5().m3());
   }

   // $VF: synthetic method
   static int n5(IComment var0, IComment var1) {
      return l6(var0, var1);
   }
}
