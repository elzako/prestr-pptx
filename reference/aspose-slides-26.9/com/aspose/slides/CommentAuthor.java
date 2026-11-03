package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

public final class CommentAuthor implements ICommentAuthor, r0g {
   private CommentAuthorCollection n5;
   private IPresentationComponent l6;
   private String k5;
   private String u3;
   private t2d a6 = new t2d();
   private w5 u9 = new w5();
   private CommentCollection h0;

   @Override
   public final String getName() {
      return this.k5;
   }

   @Override
   public final void setName(String value) {
      this.k5 = value;
   }

   @Override
   public final String getInitials() {
      return this.u3;
   }

   @Override
   public final void setInitials(String value) {
      this.u3 = value;
   }

   @Override
   public final ICommentCollection getComments() {
      return this.h0;
   }

   @Override
   public final void remove() {
      if (this.n5 == null) {
         throw new PptxEditException("Author is already removed from collection.");
      }

      synchronized (this.n5.getSyncRoot()) {
         this.n5.n5(this);
         this.n5 = null;
      }
   }

   CommentAuthor(CommentAuthorCollection parentImmediate, long id, String name, String initials) {
      this.n5 = parentImmediate;
      this.n5(id);
      this.k5 = name;
      this.u3 = initials;
      this.h0 = new CommentCollection(this);
      this.u9.n5(com.aspose.slides.ms.System.o0.l6().k5());
   }

   final int n5() {
      int var1 = 0;
      IGenericEnumerator var2 = this.h0.iterator();

      try {
         while (var2.hasNext()) {
            IComment var3 = (IComment)var2.next();
            if (com.aspose.slides.internal.v6g.k5.l6(var3, IModernComment.class)) {
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

   final t2d l6() {
      return this.a6;
   }

   final w5 k5() {
      return this.u9;
   }

   final long u3() {
      return this.l6().n5();
   }

   final void n5(long var1) {
      this.l6().n5(var1);
   }

   @Override
   public final r0g getParent_Immediate() {
      return this.n5;
   }

   final IPresentationComponent a6() {
      if (this.l6 == null) {
         IPresentationComponent[] var1 = new IPresentationComponent[]{this.l6};
         d0u.n5(IPresentationComponent.class, this.n5, var1);
         this.l6 = var1[0];
      }

      return this.l6;
   }
}
