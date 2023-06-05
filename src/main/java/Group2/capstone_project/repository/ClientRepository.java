package Group2.capstone_project.repository;

import Group2.capstone_project.domain.Client;

import java.util.List;
import java.util.Optional;

public interface ClientRepository {


    void save(Client client);

    void save(Optional<Client> client);
    Optional<Client> findId(String name, String studentNumber, String email);
    Optional<Client> findPwd(String name, String id, String studentNumber, String email);
    List<Client> findAll();
    Optional<Client> findById(String id);

    Optional<Client> login(Client client);
    void authJoin(String id);

    void updateInfo(Client client);


}
//@Service
//public class UserServiceImpl implements ClientRepository{
//    private final UserRepository userRepository;
//
//    public UserServiceImpl(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    @Override
//    public User getUserById(String userId) {
//        // userId를 이용하여 데이터베이스 등에서 사용자 정보를 조회
//        return userRepository.findById(userId).orElse(null);
//    }
//
//    @Override
//    public void save(Client client) {
//
//    }
//
//    @Override
//    public Optional<Client> findId(String name, String studentNumber, String email) {
//        return Optional.empty();
//    }
//
//    @Override
//    public Optional<Client> findPwd(String name, String id, String studentNumber, String email) {
//        return Optional.empty();
//    }
//
//    @Override
//    public List<Client> findAll() {
//        return null;
//    }
//
//    @Override
//    public Optional<Client> findById(String id) {
//        return Optional.empty();
//    }
//
//    @Override
//    public Optional<Client> login(Client client) {
//        return Optional.empty();
//    }
//
//    @Override
//    public void authJoin(String id) {
//
//    }
//
//    @Override
//    public void updateInfo(Client client) {
//
//    }
//}
