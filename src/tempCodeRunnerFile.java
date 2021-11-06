
        if(e.getSource()==submit){
            if(user_id.getText().toString().length()==0 ||
              password.getText().toString().length()==0 ){
                  new msg("All Fields must be filled","Error",this);
                return;