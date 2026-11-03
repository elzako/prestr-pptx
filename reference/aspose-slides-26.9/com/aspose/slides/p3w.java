package com.aspose.slides;

class p3w implements IResourceLoadingArgs {
   private String originalUri;
   private String uri;
   private byte[] data;

   public p3w(String var1) {
      this.originalUri = var1;
      this.uri = var1;
      this.data = new byte[0];
   }

   @Override
   public final String getOriginalUri() {
      return this.originalUri;
   }

   @Override
   public final String getUri() {
      return this.uri;
   }

   @Override
   public final void setUri(String value) {
      this.uri = value;
   }

   @Override
   public final void setData(byte[] data) {
      this.data = data;
   }

   final byte[] n5() {
      return this.data;
   }
}
