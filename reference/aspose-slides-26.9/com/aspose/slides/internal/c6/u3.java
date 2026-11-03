package com.aspose.slides.internal.c6;

import com.aspose.slides.ICommentAuthor;

class u3 extends c4 {
   private final ICommentAuthor n5;

   public u3(ICommentAuthor var1) {
      this.n5 = var1;
   }

   @Override
   protected String n5() {
      return this.n5.getName();
   }

   @Override
   protected void n5(String var1) {
      this.n5.setName(var1);
   }
}
